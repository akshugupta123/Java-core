package com.learning.core.day2session1morning;

import java.util.ArrayList;
import java.util.List;

import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	

		public class D02P057 {
		    public static void main(String[] args) {
		        String[] dictionary = {"abb", "abc", "xyz", "xyy", "foo"};
		        String pattern = "abb";

		        List<String> matchedStrings = findMatchingStrings(dictionary, pattern);

		        System.out.println("Output:");
		        for (String str : matchedStrings) {
		            System.out.println(str);
		        }
		    }

		    private static List<String> findMatchingStrings(String[] dictionary, String pattern) {
		        List<String> matchedStrings = new ArrayList<>();
		        for (String word : dictionary) {
		            if (word.length() == pattern.length() && isMatch(word, pattern)) {
		                matchedStrings.add(word);
		            }
		        }
		        return matchedStrings;
		    }

		    private static boolean isMatch(String word, String pattern) {
		        for (int i = 0; i < word.length(); i++) {
		            if (pattern.charAt(i) == ' ' || word.charAt(i) == pattern.charAt(i)) {
		                continue;
		            } else {
		                return false;
		            }
		        }
		        return true;
		    }
		}