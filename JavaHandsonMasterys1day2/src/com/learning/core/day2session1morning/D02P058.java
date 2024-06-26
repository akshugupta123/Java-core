package com.learning.core.day2session1morning;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class D02P058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        String input = scanner.nextLine().trim(); // Trim to remove leading/trailing whitespace
        scanner.close();

        if (input.length() != 10) {
            System.out.println("Output:\nNo");
            return;
        }

        Set<Character> charSet = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (!charSet.add(c)) {
                System.out.println("Output:\nYes");
                return;
            }
        }

        System.out.println("Output:\nNo");
    }
}
