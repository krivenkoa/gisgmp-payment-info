package com.skat.smev.gisgmp.domain;

import java.util.ArrayList;
import java.util.List;

public class PaymentsConditionsModel {
    private List<String> paymentId;

    public List<String> getPaymentId() {
        if (paymentId == null) {
            paymentId = new ArrayList<String>();
        }
        return paymentId;
    }
}
