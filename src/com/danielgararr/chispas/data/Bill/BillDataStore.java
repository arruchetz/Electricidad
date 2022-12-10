package com.danielgararr.chispas.data.Bill;

import com.danielgararr.chispas.domain.models.Factura;

public interface BillDataStore {

    void GetBill(Factura factura);

    void addBill(Factura factura);
}
