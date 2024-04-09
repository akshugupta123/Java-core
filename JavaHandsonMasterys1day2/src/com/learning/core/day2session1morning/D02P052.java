package com.learning.core.day2session1morning;


import java.util.Scanner;

public class D02P052 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        // Prompt the user to enter the number of vowels to count from the end
        System.out.println("Enter the number of vowels to count from the end:");
        int n = scanner.nextInt();

        // Close the Scanner to prevent resource leak
        scanner.close();

        // Count the number of vowels from the end of the string
        int count = countLastNVowels(inputString, n);

        // Print the result
        if (count == -1) {
            System.out.println("Mismatch in Vowel Count");
        } else {
            System.out.println("Last " + n + " vowels from the end: " + inputString.substring(inputString.length() - count));
        }
    }

    // Method to count the last 'n' vowels of a string
    private static int countLastNVowels(String str, int n) {
        int vowelCount = 0;
        for (int i = str.length() - 1; i >= 0 && vowelCount < n; i--) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        if (vowelCount < n) {
            return -1; // Mismatch in vowel count
        }
        return vowelCount;
    }
}