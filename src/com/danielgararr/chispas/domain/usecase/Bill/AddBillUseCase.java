package com.danielgararr.chispas.domain.usecase.Bill;

import com.danielgararr.chispas.data.Bill.BillDataStore;
import com.danielgararr.chispas.domain.models.Factura;

public class AddBillUseCase {
    private BillDataStore billDataStore;

    public AddBillUseCase(BillDataStore billDataStore){
        this.billDataStore = billDataStore;
    }

    public void execute(Factura factura){
        billDataStore.addBill(factura);
    }
}
