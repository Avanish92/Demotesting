package com.lara;

public class Prac75 {
    public static void main(String[] args) {
        String s = "aabbcde";
        char result = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);


            if(s.indexOf(ch)==s.lastIndexOf(ch)){

                result=ch;
                break;
            }
        }
        System.out.println("First non-repeating character: " + result);
    }
}
