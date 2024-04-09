package com.learning.core.day3session3afternoon;

import java.util.HashMap;
import java.util.Map;

class PhoneBook {
    private String name;
    private String phoneNumber;

    public PhoneBook(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return name + " " + phoneNumber;
    }
}

public class D03P081 {
    public static void main(String[] args) {
        // Create HashMap to store phone book details
        Map<String, String> phoneBook = new HashMap<>();

        // Add predefined phone book information
        phoneBook.put("Amal", "998787823");
        phoneBook.put("Manvitha", "937843978");
        phoneBook.put("Joseph", "7882221113");
        phoneBook.put("Smith", "8293893311");
        phoneBook.put("Kathe", "7234560011");

        // List all phone book details
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
