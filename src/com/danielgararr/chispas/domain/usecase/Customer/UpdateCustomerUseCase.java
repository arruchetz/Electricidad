package com.danielgararr.chispas.domain.usecase.Customer;

import com.danielgararr.chispas.domain.models.Cliente;

public class UpdateCustomerUseCase {
    private ItemDataStore customerDataStore;

    public UpdateCustomerUseCase(ItemDataStore customerDataStore){
        this.customerDataStore = customerDataStore;
    }

    public void execute(Cliente cliente){
        customerDataStore.updateCustomer(cliente);
    }
}
