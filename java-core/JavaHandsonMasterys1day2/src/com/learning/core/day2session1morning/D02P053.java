package com.learning.core.day2session1morning;


public class D02P053 {
    public static void main(String[] args) {
        String input = "abc";
        System.out.println("Subsequences of \"" + input + "\":");
        printSubsequences(input, "");
    }

    private static void printSubsequences(String input, String output) {
        if (input.isEmpty()) {
            // Base case: when input string is empty, print the output
            System.out.print(output + ", ");
            return;
        }
        // Case 1: Include the first character of input string
        printSubsequences(input.substring(1), output + input.charAt(0));
        // Case 2: Exclude the first character of input string
        printSubsequences(input.substring(1), output);
    }
}