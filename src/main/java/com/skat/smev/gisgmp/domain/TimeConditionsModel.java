package com.skat.smev.gisgmp.domain;

import java.util.List;

public class TimeConditionsModel {
    private String startDate;
    private String endDate;
    private String beneficiaryInn;
    private String beneficiaryKpp;
    private List<String> kbk;

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getBeneficiaryInn() {
        return beneficiaryInn;
    }

    public String getBeneficiaryKpp() {
        return beneficiaryKpp;
    }

    public List<String> getKbk() {
        return kbk;
    }
}