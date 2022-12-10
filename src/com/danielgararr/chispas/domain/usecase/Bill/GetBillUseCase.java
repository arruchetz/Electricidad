package com.danielgararr.chispas.domain.usecase.Bill;

import com.danielgararr.chispas.data.Bill.BillDataStore;
import com.danielgararr.chispas.domain.models.Factura;
import com.danielgararr.chispas.presentation.Impresion;

public class GetBillUseCase {
    private BillDataStore billDataStore;

    public GetBillUseCase(BillDataStore billDataStore){
        this.billDataStore = billDataStore;
    }

    public void execute(Factura factura){
        billDataStore.GetBill(factura);
    }
}
