package com.lara;

public class Prac38 {
    public static void main(String[] args) {
        String s1 =  "Java";
        String s2 = s1;
        s1 = s1.concat(" Programming");
        System.out.println(s1);//Java Programming
        System.out.println(s2);//Java
    }
}
