package com.lara;

public class Prac100 {
    public static void main(String[] args) {
        String s = "avaeniseh";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(s.indexOf(ch)!=s.lastIndexOf(ch)){
                if(s.indexOf(ch)==i){
                    System.out.println(ch);
                }
            }
        }
    }
}
