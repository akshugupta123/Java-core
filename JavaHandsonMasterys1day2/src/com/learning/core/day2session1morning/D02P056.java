package com.learning.core.day2session1morning;


public class D02P056 {
    public static void main(String[] args) {
        String input1 = "aabcdaabc";
        String input2 = "abcab";
        
        System.out.println("Output for \"" + input1 + "\": " + longestPrefixSuffix(input1));
        System.out.println("Output for \"" + input2 + "\": " + longestPrefixSuffix(input2));
    }

    private static int longestPrefixSuffix(String s) {
        int n = s.length();
        for (int len = n - 1; len > 0; len--) {
            if (s.substring(0, len).equals(s.substring(n - len, n))) {
                return len;
            }
        }
        return 0;
    }
}