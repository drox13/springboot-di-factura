package com.dario.curso.springboot.di.factura.springboot_difactura.models;

public class Item {
    private Product product;
    private Integer quantity;

    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}