package com.danielgararr.chispas.data.Item;

import com.danielgararr.chispas.domain.models.ProductoServicio;

public interface ItemDataStore {
    void deleteItem(ProductoServicio productoServicio);

    void GetItem(ProductoServicio productoServicio);

    void addItem(ProductoServicio productoServicio);

    void updateItem(ProductoServicio productoServicio);
}
