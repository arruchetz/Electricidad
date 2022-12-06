package com.danielgararr.chispas.data.Customer;

import com.danielgararr.chispas.domain.models.Cliente;

public interface CustomerDataStore {
    void deleteCustomer(Cliente cliente);

    void GetCustomer(Cliente cliente);

    void addCustomer(Cliente cliente);

    void updateCustomer(Cliente cliente);
}
