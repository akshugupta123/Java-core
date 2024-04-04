package com.learning.core.day2session1morning;

import java.util.Scanner;

public class D02P051 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        // Close the Scanner to prevent resource leak
        scanner.close();

        // Display the length of the string
        System.out.println("Length of the string: " + inputString.length());

        // Convert the string to uppercase
        String upperCaseString = inputString.toUpperCase();
        System.out.println("Uppercase string: " + upperCaseString);

        // Check if the string is a palindrome
        if (isPalindrome(inputString)) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
    }

    // Method to check if a string is a palindrome
    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}