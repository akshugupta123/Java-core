package com.learning.core.day4sessionafternon;

public class D04P0103 {
    public static boolean linearSearch(int[] arr, int key) {
        for (int num : arr) {
            if (num == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arrays = {
            {234, 10, 40},
            {2, 3, 4, 10, 40}
        };
        int[] keys = {10, 90};

        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Input:");
            System.out.print("Array: ");
            printArray(arrays[i]);
            System.out.println("Key: " + keys[i]);

            boolean found = linearSearch(arrays[i], keys[i]);

            System.out.println("Output:");
            if (found) {
                System.out.println("Element is Present");
            } else {
                System.out.println("Element is not Present");
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
