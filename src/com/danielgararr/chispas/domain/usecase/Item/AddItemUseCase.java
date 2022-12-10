package com.danielgararr.chispas.domain.usecase.Item;

import com.danielgararr.chispas.data.Item.ItemDataStore;
import com.danielgararr.chispas.domain.models.ProductoServicio;

public class AddItemUseCase {
    private ItemDataStore itemDataStore;

    public AddItemUseCase(ItemDataStore itemDataStore){
        this.itemDataStore = itemDataStore;
    }

    public void execute(ProductoServicio productoServicio){
        itemDataStore.addItem(productoServicio);
    }
}
