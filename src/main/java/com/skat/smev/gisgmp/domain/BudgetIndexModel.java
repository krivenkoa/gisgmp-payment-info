package com.skat.smev.gisgmp.domain;

public class BudgetIndexModel {

    private String status;
    private String paytReason;
    private String taxPeriod;
    private String taxDocNumber;
    private String taxDocDate;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaytReason() {
        return paytReason;
    }

    public void setPaytReason(String paytReason) {
        this.paytReason = paytReason;
    }

    public String getTaxPeriod() {
        return taxPeriod;
    }

    public void setTaxPeriod(String taxPeriod) {
        this.taxPeriod = taxPeriod;
    }

    public String getTaxDocNumber() {
        return taxDocNumber;
    }

    public void setTaxDocNumber(String taxDocNumber) {
        this.taxDocNumber = taxDocNumber;
    }

    public String getTaxDocDate() {
        return taxDocDate;
    }

    public void setTaxDocDate(String taxDocDate) {
        this.taxDocDate = taxDocDate;
    }
}
