package com.danielgararr.chispas.domain.usecase.Customer;

import com.danielgararr.chispas.domain.models.Cliente;

public class AddCustomerUseCase {
    private ItemDataStore customerDataStore;

    public AddCustomerUseCase(ItemDataStore customerDataStore){
        this.customerDataStore = customerDataStore;
    }

    public void execute(Cliente cliente){
        customerDataStore.addCustomer(cliente);
    }
}
