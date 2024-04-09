package com.learning.core.day3session3afternoon;

import java.util.HashMap;
import java.util.Map;

public class D03P082 {
    public static void main(String[] args) {
        // Create HashMap to store phone book details
        Map<String, String> phoneBook1 = new HashMap<>();

        // Add predefined phone book information
        phoneBook1.put("Amal", "998787823");
        phoneBook1.put("Manvitha", "937843978");
        phoneBook1.put("Joseph", "7882221113");
        phoneBook1.put("Smith", "8293893311");
        phoneBook1.put("Kathe", "7234560011");

        // Search for phone number
        String nameToSearch = "Joseph";
        String phoneNumber = phoneBook1.get(nameToSearch);

        // Output the result
        if (phoneNumber != null) {
            System.out.println("Output: " + phoneNumber);
        } else {
            System.out.println("Output: Phone number not found for " + nameToSearch);
        }
    }
}
