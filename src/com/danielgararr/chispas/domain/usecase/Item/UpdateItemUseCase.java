package com.danielgararr.chispas.domain.usecase.Item;

import com.danielgararr.chispas.domain.models.ProductoServicio;

public class UpdateItemUseCase {
    private final ItemDataStore itemDataStore;
    private ItemDataStore customerDataStore;

    public UpdateItemUseCase(ItemDataStore itemDataStore){
        this.itemDataStore = itemDataStore;
    }

    public void execute(ProductoServicio productoServicio){
        customerDataStore.updateItem(productoServicio);
    }
}
