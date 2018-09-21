package com.skat.smev.gisgmp.domain;

public class PayerModel {

    private String payerIdentifier;
    private String additionalPayerIdentifier;

    public String getPayerIdentifier() {
        return payerIdentifier;
    }

    public void setPayerIdentifier(String payerIdentifier) {
        this.payerIdentifier = payerIdentifier;
    }

    public String getAdditionalPayerIdentifier() {
        return additionalPayerIdentifier;
    }

    public void setAdditionalPayerIdentifier(String additionalPayerIdentifier) {
        this.additionalPayerIdentifier = additionalPayerIdentifier;
    }
}
