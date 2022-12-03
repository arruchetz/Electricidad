package com.danielgararr.chispas.data;

import java.util.List;

public interface ItemDataStore {
    void saveCustomer(Item item);
    void deleteCustomer(Item item);
    void updateCustomer(Item item);

    void saveCustomer(Item item);

    List<Item> getAllCustomers();
    Item findById(Integer codItem);
}
