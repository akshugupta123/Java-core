package com.learning.core.day2session1morning;

public class D02P054 {
	public static void main(String[] args) {
        String input = "aebcbda";
        System.out.println("Minimum deletions to make \"" + input + "\" palindrome: " + minDeletions(input));
    }

    private static int minDeletions(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];

        // Base case: single character is a palindrome of length 1
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        // Fill the dp table in bottom-up manner
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = 2 + dp[i + 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }

        // Length of LPS is stored at dp[0][n-1]
        return n - dp[0][n - 1];
    }
}