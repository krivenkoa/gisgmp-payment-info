package com.skat.smev.gisgmp.services;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.skat.smev.gisgmp.domain.*;
import com.skat.smev.gisgmp.model.*;
import com.skat.smev.gisgmp.transmitter.impl.ResponseTransmitterService;
import com.skat.smev.gisgmp.transmitter.impl.Smev3AdapterService;
import com.skat.smev.gisgmp.util.Base64Util;
import com.skat.smev.gisgmp.util.GisgmpPaymentInfoRequestTransformer;
import com.skat.smev.gisgmp.util.JsonUtil;
import com.skat.smev.gisgmp.util.XmlUtil;
import org.apache.log4j.Logger;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import java.text.ParseException;

/**
 * Сервис для осуществления взаимодействия данного сервиса-трансформатора
 * со СМЭВ-адаптером и с ВИС
 */
@Service
public class Smev3Service {

    private static final Logger LOGGER = Logger.getLogger(Smev3Service.class.getName());

    @Autowired
    private Smev3AdapterService smev3AdapterService;

    @Autowired
    private ResponseTransmitterService responseTransmitterService;

    /**
     * Метод преобразования и отправки запроса от ВИС и отправки в СМЭВ-адаптер
     * @param requestModel модель запроса ИНН ФЛ в формате JSON
     * @return  возвращает сведения об успешности отправки запроса
     * @throws Exception
     */
    public String sendExportChargesRequest(RequestModel requestModel) throws ParseException, JAXBException, DatatypeConfigurationException, JsonProcessingException {
        final ExportChargesRequest element = GisgmpPaymentInfoRequestTransformer.createExportChargesRequest(requestModel);
        final String xml = XmlUtil.jaxbObjectToXML(element, ExportChargesRequest.class);
        final String base64request = Base64Util.convertToBase64(xml);
        try {
            return smev3AdapterService.sendRequest(base64request, requestModel.getAttachments());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return "Error while sending request";
    }


    /**
     * Метод для приема ответа от СМЭВ-адаптера, его парсинга и отправки в ВИС
     * @param adapterResponse модель ответа от СМЭВ-адаптера по ИНН ФЛ
     * @return сведения об успешной отправке либо об ошибке отправки
     * @throws Exception
     */
    public String sendExportChargesResponse(AdapterResponseModel adapterResponse)  {
        BaseMessageModel baseMessageModel = null;
        String stringMessage = "";
        try {
            baseMessageModel = GisgmpPaymentInfoRequestTransformer.parseExportChargesResponseFromAdapter(adapterResponse);
            stringMessage = JsonUtil.stringify(baseMessageModel);
        } catch (Exception e) {
            LOGGER.error("Error while parsing adapter response: " + e.getMessage());
        }
        return responseTransmitterService.sendResponse(stringMessage);
    }
}
