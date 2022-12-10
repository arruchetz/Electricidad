package com.danielgararr.chispas.domain.usecase.Customer;

import com.danielgararr.chispas.data.Customer.CustomerDataStore;
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
