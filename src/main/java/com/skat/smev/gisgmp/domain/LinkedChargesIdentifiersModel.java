package com.skat.smev.gisgmp.domain;

import java.util.ArrayList;
import java.util.List;

public class LinkedChargesIdentifiersModel {

    private List<String> supplierBillID;

    public List<String> getSupplierBillID() {
        if (supplierBillID == null) {
            supplierBillID = new ArrayList<String>();
        }
        return this.supplierBillID;
    }
}
