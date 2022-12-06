package com.danielgararr.chispas.domain.usecase.Customer;

import com.danielgararr.chispas.domain.models.Cliente;

public class GetCustomerUseCase {
    private ItemDataStore customerDataStore;

    public GetCustomerUseCase(ItemDataStore customerDataStore){
        this.customerDataStore = customerDataStore;
    }

    public void execute(Cliente cliente){
        customerDataStore.GetCustomer(cliente);
    }
}
