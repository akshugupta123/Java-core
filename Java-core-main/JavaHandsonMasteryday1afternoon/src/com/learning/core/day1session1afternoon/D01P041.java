package com.learning.core.day1session1afternoon;

import java.util.Scanner;

public class D01P041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array of five integer elements ranging from 1 to 40
        int[] array = {7, 25, 5, 8, 17};

        // Accept two numbers from the user
        System.out.print("Enter two numbers in the range from 1 to 40 separated by a space: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        boolean foundNum1 = false;
        boolean foundNum2 = false;

        // Compare the inputted numbers with the array elements
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num1) {
                foundNum1 = true;
            }
            if (array[i] == num2) {
                foundNum2 = true;
            }
        }

        // Display the result
        if (foundNum1 && foundNum2) {
            System.out.println("Its Bingo");
        } else {
            System.out.println("Not Found");
        }
    }
}