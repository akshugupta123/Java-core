package com.learning.core.day3session3morning;

import java.util.HashSet;

class Product {
    private String productId;
    private String productName;

    public Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }
}

public class D03P072 {
    public static void main(String[] args) {
        // Create HashSet to store product details
        HashSet<Product> products = new HashSet<>();

        // Add predefined product information
        products.add(new Product("P001", "Maruti 800"));
        products.add(new Product("P002", "Maruti Zen"));
        products.add(new Product("P003", "Maruti Dezire"));
        products.add(new Product("P004", "Maruti Alto"));

        // List all the product details
        System.out.println("Product Details:");
        for (Product product : products) {
            System.out.println(product.getProductId() + " " + product.getProductName());
        }
    }
}
