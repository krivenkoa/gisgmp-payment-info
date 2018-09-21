package com.skat.smev.gisgmp.domain;

import java.util.List;

public class ChargeInfoModel {

    private String amountToPay;
    private String acknowledgmentStatus;
    private LinkedChargesIdentifiersModel linkedChargesIdentifiers;
    private PayeeModel payee;
    private PayerModel payer;
    private BudgetIndexModel budgetIndex;
    private ChangeStatusModel changeStatus;
    private DiscountModel discount;
    private List<AdditionalDataModel> additionalData;
    private String supplierBillID;
    private String billDate;
    private String validUntil;
    private String totalAmount;
    private String purpose;
    private String kbk;
    private String oktmo;
    private String deliveryDate;
    private String paymentTerm;
    private String origin;

    public String getAmountToPay() {
        return amountToPay;
    }

    public void setAmountToPay(String amountToPay) {
        this.amountToPay = amountToPay;
    }

    public String getAcknowledgmentStatus() {
        return acknowledgmentStatus;
    }

    public void setAcknowledgmentStatus(String acknowledgmentStatus) {
        this.acknowledgmentStatus = acknowledgmentStatus;
    }

    public LinkedChargesIdentifiersModel getLinkedChargesIdentifiers() {
        return linkedChargesIdentifiers;
    }

    public void setLinkedChargesIdentifiers(LinkedChargesIdentifiersModel linkedChargesIdentifiers) {
        this.linkedChargesIdentifiers = linkedChargesIdentifiers;
    }

    public PayeeModel getPayee() {
        return payee;
    }

    public void setPayee(PayeeModel payee) {
        this.payee = payee;
    }

    public PayerModel getPayer() {
        return payer;
    }

    public void setPayer(PayerModel payer) {
        this.payer = payer;
    }

    public BudgetIndexModel getBudgetIndex() {
        return budgetIndex;
    }

    public void setBudgetIndex(BudgetIndexModel budgetIndex) {
        this.budgetIndex = budgetIndex;
    }

    public ChangeStatusModel getChangeStatus() {
        return changeStatus;
    }

    public void setChangeStatus(ChangeStatusModel changeStatus) {
        this.changeStatus = changeStatus;
    }

    public DiscountModel getDiscount() {
        return discount;
    }

    public void setDiscount(DiscountModel discount) {
        this.discount = discount;
    }

    public List<AdditionalDataModel> getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(List<AdditionalDataModel> additionalData) {
        this.additionalData = additionalData;
    }

    public String getSupplierBillID() {
        return supplierBillID;
    }

    public void setSupplierBillID(String supplierBillID) {
        this.supplierBillID = supplierBillID;
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public String getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(String validUntil) {
        this.validUntil = validUntil;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getKbk() {
        return kbk;
    }

    public void setKbk(String kbk) {
        this.kbk = kbk;
    }

    public String getOktmo() {
        return oktmo;
    }

    public void setOktmo(String oktmo) {
        this.oktmo = oktmo;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getPaymentTerm() {
        return paymentTerm;
    }

    public void setPaymentTerm(String paymentTerm) {
        this.paymentTerm = paymentTerm;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
