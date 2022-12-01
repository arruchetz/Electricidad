package com.danielgararr.chispas.domain.usecase;

import com.danielgararr.chispas.data.CustomerDataStore;
import com.danielgararr.chispas.domain.models.Cliente;

public class GetCustomerUseCase {
    private CustomerDataStore customerDataStore;

    public GetCustomerUseCase(CustomerDataStore customerDataStore){
        this.customerDataStore = customerDataStore;
    }

    public void execute(Cliente cliente){
        customerDataStore.getCustomer(cliente);
    }
}
