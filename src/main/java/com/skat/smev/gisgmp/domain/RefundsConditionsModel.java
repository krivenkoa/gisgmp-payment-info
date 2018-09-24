package com.skat.smev.gisgmp.domain;


import java.util.ArrayList;
import java.util.List;

public class RefundsConditionsModel {
    private List<String> refundId;

    public List<String> getRefundId() {
        if (refundId == null) {
            refundId = new ArrayList<String>();
        }
        return refundId;
    }
}