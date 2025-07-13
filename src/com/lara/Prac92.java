package com.lara;

import java.util.Arrays;

public class Prac92 {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent0";
        if(s1.length()!=s2.length()){
            System.out.println("not an anagram");
        }else {
            char ch1[] = s1.toCharArray();
            char ch2[] = s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if (Arrays.equals(ch1, ch2)) {
                System.out.println("Anagrams");
            } else {
                System.out.println("not an Anagrams");
            }
        }

    }
}
