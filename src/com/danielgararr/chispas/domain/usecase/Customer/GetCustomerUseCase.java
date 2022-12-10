package com.danielgararr.chispas.domain.usecase.Customer;

import com.danielgararr.chispas.data.Customer.CustomerDataStore;
import com.danielgararr.chispas.domain.models.Cliente;

public class GetCustomerUseCase {
    private CustomerDataStore customerDataStore;

    public GetCustomerUseCase(CustomerDataStore customerDataStore){
        this.customerDataStore = customerDataStore;
    }

    public void execute(Cliente cliente){
        customerDataStore.GetCustomer(cliente);
    }
}
