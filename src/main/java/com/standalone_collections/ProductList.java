package com.standalone_collections;

import java.util.List;

public class ProductList {
    private List<String> products;

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "ProductList{" + "productName=" + products + '}';
    }
}
