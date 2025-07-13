package com.lara;

public class prac124 {
    public static void main(String[] args) {
        String s = "madam";
        String rev="";
        String temp=s;
        for (int i = s.length()-1; i >=0 ; i--) {
            rev=rev+s.charAt(i);
        }
        if(rev.equals(temp)){
            System.out.println(temp+" Palindorme");
        }else {
            System.out.println(temp+" Not a plaindorme");
        }
    }
}
