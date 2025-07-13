package com.lara;

public class Prac97 {
    public static void main(String[] args) {
        String s1 = "aabbcde";
        for (int i = 0; i <= s1.length()-1 ; i++) {
            char ch= s1.charAt(i);
            if(s1.indexOf(ch)==s1.indexOf(ch)){
                System.out.print(ch);
            }
        }
    }
}
