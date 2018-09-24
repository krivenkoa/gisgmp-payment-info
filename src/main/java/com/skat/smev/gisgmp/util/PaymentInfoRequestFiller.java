package com.skat.smev.gisgmp.util;

import com.skat.smev.gisgmp.domain.*;
import com.skat.smev.gisgmp.model.*;
import org.apache.log4j.Logger;

import javax.xml.datatype.DatatypeConfigurationException;
import java.math.BigInteger;
import java.text.ParseException;

public class PaymentInfoRequestFiller {

    private static final Logger LOGGER = Logger.getLogger(PaymentInfoRequestFiller.class.getName());
    private ObjectFactory factory;

    public PaymentInfoRequestFiller(ObjectFactory factory) {
        this.factory = factory;
    }

    public void fillEsiaUserInfo(ExportChargesRequest req, EsiaUserInfoModel model){

        if (model != null) {

            // general params
            EsiaUserInfoType esiaUserInfo = factory.createEsiaUserInfoType();
            if ( !StringUtil.isNullOrEmpty(model.getSessionDate())){
                try{
                    esiaUserInfo.setSessionDate(
                            DateUtil.parseXMLGregorianCalendar(model.getSessionDate(),
                                    "yyyy-MM-dd'T'HH:mm:ss.SSSz"));
                }
                catch (ParseException ex){
                    LOGGER.error("Error while parse String to XMLGregorianCalendar", ex);
                }
                catch (DatatypeConfigurationException ex){
                    LOGGER.error("Error while XMLGregorianCalendar created", ex);
                }
            }

            esiaUserInfo.setSessionIndex(model.getSessionIndex());
            esiaUserInfo.setUserId(new BigInteger(model.getUserId()));

            // person
            EsiaUserInfoType.Person.DocumentIdentity personDoc = null;
            if(!StringUtil.isNullOrEmpty(model.getPersonDocCode()) ||
                    !StringUtil.isNullOrEmpty(model.getPersonDocNumber()) ||
                    !StringUtil.isNullOrEmpty(model.getPersonDocSeries())){
                personDoc = factory.createEsiaUserInfoTypePersonDocumentIdentity();
                personDoc.setCode(model.getPersonDocCode());
                personDoc.setNumber(model.getPersonDocNumber());
                personDoc.setSeries(model.getPersonDocSeries());
            }

            if ( personDoc != null ||
                !StringUtil.isNullOrEmpty(model.getPersonInn()) ||
                !StringUtil.isNullOrEmpty(model.getPersonSnils())){

                EsiaUserInfoType.Person person = factory.createEsiaUserInfoTypePerson();
                person.setPersonINN(model.getPersonInn());
                person.setSnils(model.getPersonSnils());
                person.setDocumentIdentity(personDoc);
                esiaUserInfo.setPerson(person);
            }

            // individual business
            EsiaUserInfoType.IndividualBusiness individualBusiness = factory.createEsiaUserInfoTypeIndividualBusiness();
            if (!StringUtil.isNullOrEmpty(model.getIndividualBusinessPersonINN())){
                individualBusiness.setPersonINN(model.getIndividualBusinessPersonINN());
            }

            if (individualBusiness != null){
                esiaUserInfo.setIndividualBusiness(individualBusiness);
            }
            // set final model
            req.setEsiaUserInfo(esiaUserInfo);
        }
    }

    public void fillChargesExportConditions(ExportChargesRequest req, RequestModel model){
        if (model != null){
            ChargesExportConditions conditions = factory.createChargesExportConditions();
            conditions.setKind(model.getKind());

            // charges conditions
            if (model.getChargesConditions() != null){
                fillChargesConditions(model.getChargesConditions(), conditions);
            }

            if (model.getPayersConditions() != null ){
                fillPayersConditions(model.getPayersConditions(), conditions);
            }

            if (model.getPaymentsConditions() != null){
                fillPaymentsConditions(model.getPaymentsConditions(), conditions);
            }

            if (model.getRefundsConditions() != null){
                fillRefundsConditions(model.getRefundsConditions(), conditions);
            }

            if (model.getTimeConditions() != null){
                fillTimeConditions(model.getTimeConditions(), conditions);
            }

            req.setChargesExportConditions(conditions);
        }
    }

    public void fillTimestamp(ExportChargesRequest req, String timestamp){
        if (!StringUtil.isNullOrEmpty(timestamp)){
            try{
                req.setTimestamp(
                        DateUtil.parseXMLGregorianCalendar(timestamp,
                                "yyyy-MM-dd'T'HH:mm:ss.SSSz"));
            }
            catch (ParseException ex){
                LOGGER.error("Error while parse String to XMLGregorianCalendar", ex);
            }
            catch (DatatypeConfigurationException ex){
                LOGGER.error("Error while XMLGregorianCalendar created", ex);
            }
        }
    }

    public void fillPaging(ExportChargesRequest req, RequestModel model){
        if (model != null){
            if (!StringUtil.isNullOrEmpty(model.getPageLength()) ||
                    !StringUtil.isNullOrEmpty(model.getPageNumber())) {
                PagingType pagingType = factory.createPagingType();
                pagingType.setPageLength(new BigInteger(model.getPageLength()));
                pagingType.setPageNumber(new BigInteger(model.getPageNumber()));
                req.setPaging(pagingType);
            }
        }
    }

    private void fillChargesConditions(ChargesConditionsModel model, ChargesExportConditions conditions){
        ChargesConditionsType charges = factory.createChargesConditionsType();
        TimeIntervalType timeInterval = createTimeInterval(model.getStartDate(), model.getEndDate());
        if(timeInterval != null){
            charges.setTimeInterval(timeInterval);
        }

        if (model.getSupplierBillID() != null) {
            charges.getSupplierBillID().addAll(model.getSupplierBillID());
        }
        conditions.setChargesConditions(charges);
    }

    private void fillPayersConditions(PayersConditionsModel model, ChargesExportConditions conditions){
        PayersConditionsType payers = factory.createPayersConditionsType();
        TimeIntervalType timeInterval = createTimeInterval(model.getStartDate(), model.getEndDate());
        if(timeInterval != null) {
            payers.setTimeInterval(timeInterval);
        }

        if(model.getKbk() != null){
            KBKlist kbkList = factory.createKBKlist();
            kbkList.getKBK().addAll(model.getKbk());
            payers.setKBKlist(kbkList);
        }

        if(model.getPayerIdentifier() != null)
        {
            model.getPayerIdentifier().addAll(model.getPayerIdentifier());
        }

        if(model.getPayerInn() != null){
            payers.getPayerInn().addAll(model.getPayerInn());
        }

        conditions.setPayersConditions(payers);
    }

    private void fillPaymentsConditions(PaymentsConditionsModel model, ChargesExportConditions conditions){
        PaymentsConditionsType payments = factory.createPaymentsConditionsType();
        if (model.getPaymentId() != null){
            payments.getPaymentId().addAll(model.getPaymentId());
        }
        conditions.setPaymentsConditions(payments);
    }

    private void fillRefundsConditions(RefundsConditionsModel model, ChargesExportConditions conditions) {

        RefundsConditionsType refunds = factory.createRefundsConditionsType();
        if (model.getRefundId() != null) {
            refunds.getRefundId().addAll(model.getRefundId());
        }
        conditions.setRefundsConditions(refunds);
    }

    private void fillTimeConditions(TimeConditionsModel model, ChargesExportConditions conditions){

        TimeConditionsType time = factory.createTimeConditionsType();

        if (model.getKbk() != null) {
            KBKlist kbklist = factory.createKBKlist();
            kbklist.getKBK().addAll(model.getKbk());
            time.setKBKlist(kbklist);
        }

        TimeIntervalType timeInterval = createTimeInterval(model.getStartDate(), model.getEndDate());
        if(timeInterval != null) {
            time.setTimeInterval(timeInterval);
        }

        if (model.getBeneficiary() != null) {
            for (BeneficiaryModel beneficiaryModel : model.getBeneficiary()) {
                if (!StringUtil.isNullOrEmpty(beneficiaryModel.getInn()) ||
                        !StringUtil.isNullOrEmpty(beneficiaryModel.getKpp())) {
                    TimeConditionsType.Beneficiary beneficiary = factory.createTimeConditionsTypeBeneficiary();
                    time.getBeneficiary().add(beneficiary);
                }
            }
        }

        conditions.setTimeConditions(time);
    }

    private TimeIntervalType createTimeInterval(String startDate, String endDate){
        TimeIntervalType timeInterval = factory.createTimeIntervalType();

        if ( !StringUtil.isNullOrEmpty(startDate) ||
                !StringUtil.isNullOrEmpty(endDate)) {
            try{
                timeInterval.setStartDate(
                        DateUtil.parseXMLGregorianCalendar(startDate,
                                "yyyy-MM-dd'T'HH:mm:ss.SSSz"));
                timeInterval.setEndDate(
                        DateUtil.parseXMLGregorianCalendar(endDate,
                                "yyyy-MM-dd'T'HH:mm:ss.SSSz"));
            }
            catch (ParseException ex){
                LOGGER.error("Error while parse String to XMLGregorianCalendar", ex);
            }
            catch (DatatypeConfigurationException ex){
                LOGGER.error("Error while XMLGregorianCalendar created", ex);
            }
        }
        return timeInterval;
    }
}
