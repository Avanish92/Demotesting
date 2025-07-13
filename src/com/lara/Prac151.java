package com.lara;

public class Prac151 {
    public static void main(String[] args) {
        String s = "hello";
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            char ch= Character.toLowerCase(s.charAt(i));
            if(ch=='a' || ch =='e' || ch=='o' || ch =='u' || ch=='i'){
                count++;
            }
        }
        System.out.println(count);
    }
}
