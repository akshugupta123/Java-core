package com.learning.core.day1session1afternoon;

import java.util.ArrayList;
import java.util.Scanner;

public class D01P044 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the array of numbers as a string
        System.out.print("Enter the array of numbers: ");
        String numString = scanner.next();
        
        // Input the value of k
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();
        
        // Convert the string to an integer array
        int[] nums = new int[numString.length()];
        for (int i = 0; i < numString.length(); i++) {
            nums[i] = numString.charAt(i) - '0';
        }
        
        // Find all distinct combinations of numbers
        ArrayList<String> combinations = findCombinations(nums, k);
        
        // Display the distinct combinations
        System.out.println("Distinct combinations:");
        for (String combination : combinations) {
            System.out.print(combination + " ");
        }
    }
    
    // Function to find all distinct combinations of numbers of length k
    private static ArrayList<String> findCombinations(int[] nums, int k) {
        ArrayList<String> combinations = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        findCombinationsHelper(nums, k, 0, sb, combinations);
        return combinations;
    }
    
    private static void findCombinationsHelper(int[] nums, int k, int start, StringBuilder sb, ArrayList<String> combinations) {
        if (sb.length() == k) {
            combinations.add(sb.toString());
            return;
        }
        
        for (int i = start; i < nums.length; i++) {
            sb.append(nums[i]);
            findCombinationsHelper(nums, k, i + 1, sb, combinations);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
