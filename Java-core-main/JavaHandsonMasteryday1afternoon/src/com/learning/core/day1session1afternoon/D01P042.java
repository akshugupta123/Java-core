package com.learning.core.day1session1afternoon;

public class D01P042 {
    public static void main(String[] args) {
        // Create an integer array with 18 elements
        int[] A = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};

        // Compute the sum of elements from index 0 to 14 and store it at element 15
        int sum = 0;
        for (int i = 0; i <= 14; i++) {
            sum += A[i];
        }
        A[15] = sum;

        // Compute the average of all numbers and store it at element 16
        double average = (double) sum / 18;
        A[16] = (int) average; // Convert to int since the array stores integers

        // Identify the smallest value from the array and store it at element 17
        int smallest = A[0];
        for (int i = 1; i < 18; i++) {
            if (A[i] < smallest) {
                smallest = A[i];
            }
        }
        A[17] = smallest;

        // Display the updated array
        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}
