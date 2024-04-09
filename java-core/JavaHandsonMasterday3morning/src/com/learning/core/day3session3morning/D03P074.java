package com.learning.core.day3session3morning;

import java.util.HashSet;
import java.util.Iterator;

class Product2 {
    private String productId;
    private String productName;

    public Product2(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Product2 product = (Product2) obj;
        return productId.equals(product.productId);
    }

    @Override
    public int hashCode() {
        return productId.hashCode();
    }
}

public class D03P074 {
    public static void main(String[] args) {
        // Create HashSet to store product details
        HashSet<Product2> products = new HashSet<>();

        // Add predefined product information
        products.add(new Product2("P001", "Maruti 800"));
        products.add(new Product2("P002", "Maruti Zen"));
        products.add(new Product2("P003", "Maruti Dezire"));
        products.add(new Product2("P004", "Maruti Alto"));

        // Input: Product ID to remove
        String productIdToRemove = "P002";

        // Remove the product with the given ID
        Iterator<Product2> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product2 product = iterator.next();
            if (product.getProductId().equals(productIdToRemove)) {
                iterator.remove();
                break;
            }
        }

        // Output the remaining products
        for (Product2 product : products) {
            System.out.println(product.getProductId() + " " + product.getProductName());
        }
    }
}

