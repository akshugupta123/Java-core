package com.learning.core.day2session1morning;
import java.util.*;

public class D02P055 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        int n = scanner.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.next();
        }
        scanner.close();

        if (canFormCircle(strings)) {
            System.out.println("Output:\nYes");
        } else {
            System.out.println("Output:\nNo");
        }
    }

    private static boolean canFormCircle(String[] strings) {
        Map<Character, Integer> firstCharCount = new HashMap<>();
        Map<Character, Integer> lastCharCount = new HashMap<>();

        for (String str : strings) {
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);
            firstCharCount.put(firstChar, firstCharCount.getOrDefault(firstChar, 0) + 1);
            lastCharCount.put(lastChar, lastCharCount.getOrDefault(lastChar, 0) + 1);
        }

        for (char c : firstCharCount.keySet()) {
            if (!firstCharCount.getOrDefault(c, 0).equals(lastCharCount.getOrDefault(c, 0))) {
                return false;
            }
        }

        return true;
    }
}