package com.skat.smev.gisgmp.domain;

import java.util.ArrayList;
import java.util.List;

public class ChargesConditionsModel {
    private List<String> supplierBillID;
    private String startDate;
    private String endDate;

    public List<String> getSupplierBillID() {
        if (supplierBillID == null) {
            supplierBillID = new ArrayList<String>();
        }
        return supplierBillID;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }
}
