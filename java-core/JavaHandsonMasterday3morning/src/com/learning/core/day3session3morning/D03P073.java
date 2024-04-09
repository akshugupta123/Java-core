//package com.learning.core.day3session3morning;

package com.learning.core.day3session3morning;

import java.util.HashSet;

class Product1 {
    private String productId;
    private String productName;

    public Product1(String productId, String productName) {
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
        Product1 product = (Product1) obj;
        return productId.equals(product.productId) && productName.equals(product.productName);
    }

    @Override
    public int hashCode() {
        int result = productId.hashCode();
        result = 31 * result + productName.hashCode();
        return result;
    }
}

public class D03P073 {
    public static void main(String[] args) {
        // Create HashSet to store product details
        HashSet<Product1> products = new HashSet<>();

        // Add predefined product information
        products.add(new Product1("P001", "Maruti 800"));
        products.add(new Product1("P002", "Maruti Zen"));
        products.add(new Product1("P003", "Maruti Dezire"));
        products.add(new Product1("P004", "Maruti Alto"));

        // Search for a particular product
        String searchProductId = "P003"; // Input: "P003"
        String searchProductName = "Maruti Dezire"; // Input: "Maruti Dezire"
        Product1 searchProduct = new Product1(searchProductId, searchProductName);

        // Print the input values
        System.out.println("Input:");
        System.out.println("Product ID: " + searchProductId);
        System.out.println("Product Name: " + searchProductName);

        // Check if the product exists in the HashSet
        if (products.contains(searchProduct)) {
            System.out.println("Output: Product Found"); // Output: Product Found
        } else {
            System.out.println("Output: Product Not Found");
        }
    }
}
