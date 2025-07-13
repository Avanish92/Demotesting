package com.lara;

public class prac123 {
    public static void main(String[] args) {
        int num=121;
        int rev=0;
        int tem=num;
        while (num>0){
            int rem=num%10;
            rev = (rev*10)+rem;
            num/=10;
        }
        if(rev==tem){
            System.out.println(tem +" Plaindrome");
        }else {
            System.out.println(num+" Not a plaindorme");
        }

    }
}
