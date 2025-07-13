package com.lara;

public class Prac155 {
    public static void main(String[] args) {
        String s ="aaadbbccdddd";
        char maxChar = s.charAt(0);
        int maxCount = 1;
        int i = 0;
        while (i < s.length()) {
            char currentChar = s.charAt(i);
            int currentCount = 1;
            // Find the end of the consecutive sequence using substring
            int j = i + 1;
            while (j < s.length() && s.charAt(j) == currentChar) {
                currentCount++;
                j++;
            }
            // Extract substring to confirm the sequence (optional, for demonstration)
            if (j <= s.length()) {
                String sub = s.substring(i, j);
                if (sub.length() == currentCount && sub.charAt(0) == currentChar) {
                    if (currentCount > maxCount) {
                        maxCount = currentCount;
                        maxChar = currentChar;
                    }
                }
            }
            i = j; // Move to the next different character
        }

        System.out.println("String: " + s + ", Max consecutive char: " + maxChar + ", Count: " + maxCount);
    }
    }

