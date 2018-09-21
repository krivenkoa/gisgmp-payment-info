package com.skat.smev.gisgmp.domain;

import java.util.List;

public class PayersConditionsModel {
    private List<String> payerInn;
    private List<String> payerIdentifier;
    private String startDate;
    private String endDate;
    private List<String> kbk;

    public List<String> getPayerInn() {
        return payerInn;
    }

    public List<String> getPayerIdentifier() {
        return payerIdentifier;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public List<String> getKbk() {
        return kbk;
    }
}
