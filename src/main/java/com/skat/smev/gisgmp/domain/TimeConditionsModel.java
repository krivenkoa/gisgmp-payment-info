package com.skat.smev.gisgmp.domain;

import java.util.List;

public class TimeConditionsModel {
    private String startDate;
    private String endDate;
    private List<BeneficiaryModel> beneficiary;
    private List<String> kbk;

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public List<String> getKbk() {
        return kbk;
    }

    public List<BeneficiaryModel> getBeneficiary() { return beneficiary; }
}