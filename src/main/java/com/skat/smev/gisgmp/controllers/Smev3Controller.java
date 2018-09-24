package com.skat.smev.gisgmp.controllers;


import com.skat.smev.gisgmp.domain.AdapterResponseModel;
import com.skat.smev.gisgmp.domain.RequestModel;
import com.skat.smev.gisgmp.services.Smev3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/gisgmp")
public class Smev3Controller {


    @Autowired
    private Smev3Service smev3Service;

    /**
     * Метод преобразования и отправки запроса от ВИС и отправки в СМЭВ-адаптер
     * @param request модель запроса ГИС ГМП по информации о платежах в формате JSON
     * @return  возвращает сведения об успешности отправки запроса
     * @throws Exception
     */
    @PostMapping("/payinfo/request")
    public String sendPaymentInfoRequest(@RequestBody RequestModel request) throws Exception {
        return smev3Service.sendExportChargesRequest(request);
    }


    /**
     * Метод для приема ответа от СМЭВ-адаптера, его парсинга и отправки в ВИС
     * @param adapterResponse модель ответа от СМЭВ-адаптера ГИС ГМП по информации о платежах
     * @return сведения об успешной отправке либо об ошибке отправки
     * @throws Exception
     */
        @PostMapping("/payinfo/response")
    public String sendPaymentInfoResponse(@RequestBody AdapterResponseModel adapterResponse) throws Exception {
        return smev3Service.sendExportChargesResponse(adapterResponse);
    }
}
