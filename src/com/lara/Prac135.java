package com.lara;

public class Prac135 {
    public static void main(String[] args) {
        String s = "I love Coding";
        String rev = "";
        for (int i = s.length()-1; i >=0 ; i--) {
            System.out.print(rev+s.charAt(i));
        }
    }
}
