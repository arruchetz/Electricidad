package com.danielgararr.chispas.domain.usecase.Customer;

import com.danielgararr.chispas.data.Customer.CustomerDataStore;
import com.danielgararr.chispas.domain.models.Cliente;

public class DeleteCustomerUseCase {
    private CustomerDataStore customerDataStore;

    public DeleteCustomerUseCase(CustomerDataStore customerDataStore){
        this.customerDataStore = customerDataStore;
    }

    public void execute(Cliente cliente){
        customerDataStore.deleteCustomer(cliente);
    }
}
