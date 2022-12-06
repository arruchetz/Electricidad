package com.danielgararr.chispas.domain.usecase.Item;

import com.danielgararr.chispas.domain.models.ProductoServicio;

public class DeleteItemUseCase {
    private ItemDataStore itemDataStore;

    public DeleteItemUseCase(ItemDataStore itemDataStore){
        this.itemDataStore = itemDataStore;
    }

    public void execute(ProductoServicio productoServicio){
        itemDataStore.deleteItem(productoServicio);
    }
}
