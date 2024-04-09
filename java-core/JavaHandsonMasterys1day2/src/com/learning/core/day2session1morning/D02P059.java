package com.learning.core.day2session1morning;

import java.util.Scanner;

public class D02P059 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        String input = scanner.nextLine();
        scanner.close();

        String replacedString = replaceSpaces(input);
        System.out.println("Output:");
        System.out.println(replacedString);
    }

    private static String replaceSpaces(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (c == ' ') {
                result.append("%20");
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}

