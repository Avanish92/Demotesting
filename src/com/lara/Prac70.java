package com.lara;

public class Prac70 {
    public static void main(String[] args) {
        String s1 = "My name is avanish";
        int count = 1;
        for (int i = 0; i < s1.length(); i++) {
            if((s1.charAt(i)==' ') && (s1.charAt(i+1)!=' '))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
