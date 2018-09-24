package com.skat.smev.gisgmp.domain;

import java.util.ArrayList;
import java.util.List;

public class PayersConditionsModel {
    private List<String> payerInn;
    private List<String> payerIdentifier;
    private String startDate;
    private String endDate;
    private List<String> kbk;

    public List<String> getPayerInn() {
        if (payerInn == null) {
            payerInn = new ArrayList<String>();
        }
        return payerInn;
    }

    public List<String> getPayerIdentifier() {
        if (payerIdentifier == null) {
            payerIdentifier = new ArrayList<String>();
        }
        return payerIdentifier;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public List<String> getKbk() {
        if (kbk == null) {
            kbk = new ArrayList<String>();
        }
        return kbk;
    }
}
