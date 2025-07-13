package com.lara;

public class Prac101 {
    public static void main(String[] args) {
        String s = "madam";
        String temp = s;
        String rev = "";
        for (int i = 0; i < s.length(); i++) {
            rev+=s.charAt(i);
        }
        if(temp.equals(rev)){
            System.out.println(s+"Palindorme");
        }else {
            System.out.println("Not a plaindrome");
        }
    }
}
