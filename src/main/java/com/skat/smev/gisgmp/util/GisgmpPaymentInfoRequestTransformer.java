package com.skat.smev.gisgmp.util;


import com.skat.smev.gisgmp.domain.*;
import org.apache.log4j.Logger;
import com.skat.smev.gisgmp.domain.*;
import com.skat.smev.gisgmp.model.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.datatype.DatatypeFactory;

public class GisgmpPaymentInfoRequestTransformer {
    private static final Logger LOGGER = Logger.getLogger(GisgmpPaymentInfoRequestTransformer.class.getName());

    /*ИНН ФЛ: Запрос*/
    public static ExportChargesRequest createExportChargesRequest(RequestModel model){
        ObjectFactory exportChargesOF = new ObjectFactory();

        // create InnFLReq
        ExportChargesRequest exportChargesReq = exportChargesOF.createExportChargesRequest();

        return exportChargesReq;
    }

  /**
     * Метод выполняет преобразование ответа от СМЭВ-адаптера в формат {@link BaseMessageModel}
     * @param adapterResponseModel ответ от СМЭВ-адаптера по ИНН ФЛ от ФНС
     * @return формированный ответ для дальнейшей отправки в ВИС
     * @throws Exception
     */
    public static BaseMessageModel parseExportChargesResponseFromAdapter(AdapterResponseModel adapterResponseModel) throws Exception {
        LOGGER.info("Try to parse response from adapter");
        LOGGER.info("Response: " + adapterResponseModel);

        if(adapterResponseModel.getResponse() != null){
            String xml = Base64Util.getXmlFromBase64(adapterResponseModel.getResponse());
            final ExportChargesResponse response = XmlUtil.unmarshal(xml, ExportChargesResponse.class);
            ResponseMessageModel responseMessageModel = new ResponseMessageModel();

            responseMessageModel.setMessageId(adapterResponseModel.getMessageId());
            return responseMessageModel;
        } else if(adapterResponseModel.getRejects() != null && !adapterResponseModel.getRejects().isEmpty()){
            return createRejectMessageModel(adapterResponseModel);
        } else {
            return createStatusMessageModel(adapterResponseModel);
        }
    }

    /**/
    private static RejectMessageModel createRejectMessageModel(AdapterResponseModel adapterResponseModel){
        RejectMessageModel rejectMessageModel = new RejectMessageModel();
        rejectMessageModel.setMessageId(adapterResponseModel.getMessageId());
        rejectMessageModel.setRejects(adapterResponseModel.getRejects());
        return rejectMessageModel;
    }

    /**/
    private static StatusMessageModel createStatusMessageModel(AdapterResponseModel adapterResponseModel){
        StatusMessageModel statusMessageModel = new StatusMessageModel();
        statusMessageModel.setMessageId(adapterResponseModel.getMessageId());
        statusMessageModel.setDescription(adapterResponseModel.getDescription());
        return statusMessageModel;
    }

    private static XMLGregorianCalendar stringToXmlGregorianCalendar(String value){

        XMLGregorianCalendar xmlGregCal = null;
        try{
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date date = format.parse(value);
            GregorianCalendar cal = new GregorianCalendar();
            cal.setTime(date);
            xmlGregCal =  DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        }
        catch(java.text.ParseException parseEx){
            LOGGER.error("Incorrect date format (yyyy-MM-dd):"+value, parseEx);
        }
        catch(javax.xml.datatype.DatatypeConfigurationException confEx){
            LOGGER.error("Error while XMLGregorianCalendar created:"+value, confEx);
        }
        return xmlGregCal;
    }
}
