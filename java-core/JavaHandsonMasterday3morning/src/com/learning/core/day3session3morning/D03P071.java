package com.learning.core.day3session3morning;

//package com.learning.core.day3session3morning;

import java.util.ArrayList;

public class D03P071 {
    public static void main(String[] args) {
        // Create ArrayList to store student names
        ArrayList<String> studentNames = new ArrayList<>();

        // Add student names to the ArrayList
        studentNames.add("Jack");
        studentNames.add("Paul");
        studentNames.add("Henry");
        studentNames.add("Mary");
        studentNames.add("Ronaldo");

        // Display the input
        System.out.println("Input: " + studentNames);

        // Name to search
        String nameToSearch = "Henry";

        // Check if the name exists in the list
        boolean found = false;
        for (String name : studentNames) {
            if (name.equals(nameToSearch)) {
                found = true;
                break;
            }
        }

        // Output the result
        if (found) {
            System.out.println("Output: Found");
        } else {
            System.out.println("Output: Not Found");
        }
    }
}
