package com.lara;

public class Prac111 {
    public static void main(String[] args) {
        String s = "NaveeN AutomatioN";
        String upper = "";
        String lower = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch>='A' && ch<='Z'){
                upper+=ch;
            }else {
                lower+=ch;
            }
        }
        System.out.println(upper);
        System.out.println(lower);
    }
}
