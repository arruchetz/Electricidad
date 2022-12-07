package com.danielgararr.chispas.domain.usecase.Bill;

import com.danielgararr.chispas.data.Bill.BillDataStore;

public class GetBillUseCase {
    private BillDataStore billDataStore;

    public GetBillUseCase(BillDataStore billDataStore){
        this.billDataStore = billDataStore;
    }

    public void execute(){
        billDataStore.GetBill(factura);
    }
}
