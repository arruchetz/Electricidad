package com.danielgararr.chispas.data;

import com.danielgararr.chispas.domain.models.Cliente;
import com.danielgararr.chispas.domain.models.Item;

import java.util.List;

public interface ItemDataStore {
    void deleteItem(Item item);

    void GetItem(Item item);

    void addItem(Item item);

    void updateItem(Item item);
}
