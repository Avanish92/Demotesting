package com.lara;

public class Prac95 {
    public static void main(String[] args) {
        String s1 = "Ramra";
        Character res = null;
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if(s1.indexOf(ch)==s1.lastIndexOf(ch)){
                res=ch;
            }
        }
        System.out.println(res);

    }
}
