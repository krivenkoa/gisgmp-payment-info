package com.skat.smev.gisgmp.util;

import com.skat.smev.gisgmp.domain.*;
import com.skat.smev.gisgmp.model.AdditionalDataType;
import com.skat.smev.gisgmp.model.ExportChargesResponse;

import java.util.ArrayList;
import java.util.List;

public class ResponseMessageModelFiller {

    public ResponseMessageModel createResponseMessageModel(ExportChargesResponse response, AdapterResponseModel adapterResponseModel){
        ResponseMessageModel responseMessageModel = new ResponseMessageModel();
        responseMessageModel.setMessageId(adapterResponseModel.getMessageId());
        responseMessageModel.setId(response.getId());
        responseMessageModel.setHasMore(Boolean.toString(response.isHasMore()));
        responseMessageModel.setNeedReRequest(Boolean.toString(response.isNeedReRequest()));
        responseMessageModel.setRecipientIdentifier(response.getRecipientIdentifier());
        responseMessageModel.setRqId(response.getRqId());
        responseMessageModel.setTimestamp(response.getTimestamp().toString());

        List<ChargeInfoModel> chargeInfoList = new ArrayList<ChargeInfoModel>();
        for (ExportChargesResponse.ChargeInfo chargeInfo : response.getChargeInfo()) {
            ChargeInfoModel model = new ChargeInfoModel();
            model.setAcknowledgmentStatus(chargeInfo.getAcknowledgmentStatus());
            model.setAdditionalData(getAdditionalDataList(chargeInfo));
            model.setAmountToPay(Long.toString(chargeInfo.getAmountToPay()));
            model.setBillDate(chargeInfo.getBillDate().toString());
            model.setBudgetIndex(getBudgetIndexModel(chargeInfo));
            model.setChangeStatus(getChangeStatusModel(chargeInfo));
            model.setDeliveryDate(chargeInfo.getDeliveryDate().toString());
            model.setDiscount(getDiscountModel(chargeInfo));
            model.setKbk(chargeInfo.getKbk());
            model.setLinkedChargesIdentifiers(getLinkedChargesIdentifiersModel(chargeInfo));
            model.setOktmo(chargeInfo.getOktmo());
            model.setOrigin(chargeInfo.getOrigin());
            model.setPayee(getPayeeModel(chargeInfo));
            model.setPayer(getPayerModel(chargeInfo));
            model.setPaymentTerm(chargeInfo.getPaymentTerm().toString());
            model.setPurpose(chargeInfo.getPurpose());
            model.setSupplierBillID(chargeInfo.getSupplierBillID());
            model.setTotalAmount(chargeInfo.getTotalAmount().toString());
            model.setValidUntil(chargeInfo.getValidUntil().toString());
            chargeInfoList.add(model);
        }

        responseMessageModel.getChargeInfo().addAll(chargeInfoList);
        return responseMessageModel;
    }

    private List<AdditionalDataModel> getAdditionalDataList(ExportChargesResponse.ChargeInfo model){
        List<AdditionalDataModel> addDataModelList = new ArrayList<AdditionalDataModel>();
        for (AdditionalDataType addData : model.getAdditionalData()) {
            AdditionalDataModel addDataModel = new AdditionalDataModel();
            addDataModel.setName(addData.getName());
            addDataModel.setValue(addData.getValue());
            addDataModelList.add(addDataModel);
        }
        return addDataModelList;
    }

    private BudgetIndexModel getBudgetIndexModel(ExportChargesResponse.ChargeInfo model){

        if (model.getBudgetIndex() != null){
            BudgetIndexModel budgetIndexModel = new BudgetIndexModel();
            budgetIndexModel.setPaytReason(model.getBudgetIndex().getPaytReason());
            budgetIndexModel.setStatus(model.getBudgetIndex().getStatus());
            budgetIndexModel.setTaxDocDate(model.getBudgetIndex().getTaxDocDate());
            budgetIndexModel.setTaxDocNumber(model.getBudgetIndex().getTaxPeriod());
            budgetIndexModel.setTaxPeriod(model.getBudgetIndex().getTaxPeriod());
            return budgetIndexModel;
        }

        return null;
    }

    private ChangeStatusModel getChangeStatusModel(ExportChargesResponse.ChargeInfo model){

        if (model.getChangeStatus() != null){
            ChangeStatusModel changeStatusModel = new ChangeStatusModel();
            changeStatusModel.setMeaning(model.getChangeStatus().getMeaning());
            changeStatusModel.setReason(model.getChangeStatus().getReason());
            return changeStatusModel;
        }

        return null;
    }

    private DiscountModel getDiscountModel(ExportChargesResponse.ChargeInfo model){
        if (model.getDiscount() != null && model.getDiscount().getValue() != null){
            DiscountModel discountModel = new DiscountModel();
            discountModel.setExpiry(model.getDiscount().getValue().getExpiry());
            discountModel.setValue(Float.toString(model.getDiscount().getValue().getValue()));
            return discountModel;
        }

        return null;
    }

    private LinkedChargesIdentifiersModel getLinkedChargesIdentifiersModel(ExportChargesResponse.ChargeInfo model){

        if (model.getLinkedChargesIdentifiers() != null) {
            LinkedChargesIdentifiersModel linkedCharges = new LinkedChargesIdentifiersModel();
            linkedCharges.getSupplierBillID().addAll(model.getLinkedChargesIdentifiers().getSupplierBillID());
            return linkedCharges;
        }

        return null;
    }

    private PayeeModel getPayeeModel(ExportChargesResponse.ChargeInfo model){

        if (model.getPayee() != null){
            PayeeModel payeeModel = new PayeeModel();
            payeeModel.setInn(model.getPayee().getInn());
            payeeModel.setKpp(model.getPayee().getKpp());
            payeeModel.setOgrn(model.getPayee().getOgrn());
            payeeModel.setName(model.getPayee().getName());

            if (model.getPayee().getOrgAccount() != null){
                payeeModel.setAccountNumber(model.getPayee().getOrgAccount().getAccountNumber());

                if (model.getPayee().getOrgAccount().getBank() != null){
                    payeeModel.setBankBik(model.getPayee().getOrgAccount().getBank().getBik());
                    payeeModel.setBankName(model.getPayee().getOrgAccount().getBank().getName());
                    payeeModel.setCorrespondentBankAccount(
                            model.getPayee().getOrgAccount().getBank().getCorrespondentBankAccount());
                }
            }

            return payeeModel;
        }

        return null;
    }

    private PayerModel getPayerModel(ExportChargesResponse.ChargeInfo model){

        if (model.getPayer() != null){
            PayerModel payerModel = new PayerModel();
            payerModel.setPayerIdentifier(model.getPayer().getPayerIdentifier());
            payerModel.setAdditionalPayerIdentifier(model.getPayer().getAdditionalPayerIdentifier());
            return payerModel;
        }

        return null;
    }
}
