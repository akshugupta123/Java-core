package com.learning.core.day1session1afternoon;

import java.util.HashMap;
import java.util.Scanner;

public class D01P043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int N = scanner.nextInt();
        
        // Input the elements of the array
        int[] arr = new int[N];
        System.out.print("Enter the elements of the array separated by space: ");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // HashMap to store the index of the first occurrence of each element
        HashMap<Integer, Integer> map = new HashMap<>();
        int minIndex = Integer.MAX_VALUE; // Initialize the minimum index to a large value
        
        // Iterate through the array to find the first repeating element
        for (int i = 0; i < N; i++) {
            if (map.containsKey(arr[i])) {
                minIndex = Math.min(minIndex, map.get(arr[i]));
            } else {
                map.put(arr[i], i);
            }
        }
        
        // Display the index of the first repeating element
        if (minIndex == Integer.MAX_VALUE) {
            System.out.println("No repeating element found.");
        } else {
            System.out.println("Index of the first repeating element: " + minIndex);
        }
    }
}
