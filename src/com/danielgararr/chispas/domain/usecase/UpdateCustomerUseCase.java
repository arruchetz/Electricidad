package com.danielgararr.chispas.domain.usecase;

import com.danielgararr.chispas.data.CustomerDataStore;
import com.danielgararr.chispas.domain.models.Cliente;

public class UpdateCustomerUseCase {
    private CustomerDataStore customerDataStore;

    public UpdateCustomerUseCase(CustomerDataStore customerDataStore){
        this.customerDataStore = customerDataStore;
    }

    public void execute(Cliente cliente){
        customerDataStore.updateCustomer(cliente);
    }
}
