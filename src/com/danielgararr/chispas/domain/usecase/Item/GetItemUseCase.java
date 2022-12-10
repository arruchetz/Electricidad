package com.danielgararr.chispas.domain.usecase.Item;

import com.danielgararr.chispas.data.Item.ItemDataStore;
import com.danielgararr.chispas.domain.models.ProductoServicio;

public class GetItemUseCase {
    private ItemDataStore itemDataStore;

    public GetItemUseCase(ItemDataStore ItemDataStore){
        this.itemDataStore = itemDataStore;
    }

    public void execute(ProductoServicio productoServicio){
        itemDataStore.GetItem(productoServicio);
    }
}
