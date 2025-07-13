package com.lara;

public class Prac89 {
    public static void main(String[] args) {
        String s1 = "madam";
        String rev = "";
        String temp=s1;
        for (int i = s1.length()-1; i >=0 ; i--) {
            rev += s1.charAt(i);
        }
        System.out.println(rev);
        if(temp.equals(rev)){
            System.out.println("Is a plaindorme");
        }else{
            System.out.println("Not a plaindrome");
        }
    }
}
