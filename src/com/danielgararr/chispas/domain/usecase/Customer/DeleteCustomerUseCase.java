package com.danielgararr.chispas.domain.usecase.Customer;

import com.danielgararr.chispas.domain.models.Cliente;

public class DeleteCustomerUseCase {
    private ItemDataStore customerDataStore;

    public DeleteCustomerUseCase(ItemDataStore customerDataStore){
        this.customerDataStore = customerDataStore;
    }

    public void execute(Cliente cliente){
        customerDataStore.deleteCustomer(cliente);
    }
}
