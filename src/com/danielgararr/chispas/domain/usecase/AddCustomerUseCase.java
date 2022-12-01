package com.danielgararr.chispas.domain.usecase;

import com.danielgararr.chispas.data.CustomerDataStore;
import com.danielgararr.chispas.domain.models.Cliente;

public class AddCustomerUseCase {
    private CustomerDataStore customerDataStore;

    public AddCustomerUseCase(CustomerDataStore customerDataStore){
        this.customerDataStore = customerDataStore;
    }

    public void execute(Cliente cliente){
        customerDataStore.addCustomer(cliente);
    }
}
