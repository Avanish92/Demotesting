package com.lara;

public class Prac63 {
    public static void main(String[] args) {
        String s = "Java Programming Java oops";
        int total = s.length();
       int afterremovelength= s.replace("a","").length();
        System.out.println(total-afterremovelength);
    }
}
