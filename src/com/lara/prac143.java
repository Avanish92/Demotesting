package com.lara;

public class prac143 {
    public static void main(String[] args) {
        String s = "programming";
        String rev="";
        char[] ch = s.toCharArray();
        for (int i = ch.length-1; i >=0 ; i--) {
                 rev+=ch[i];
        }
        System.out.println(rev);
    }
}
