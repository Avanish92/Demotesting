package com.lara;

public class Prac128 {
    public static void main(String[] args) {
        int num = 102345;
        int rev=0;
        while (num>0){
            int rem =  num%10;
            rev= (rev*10)+rem;
            num/=10;
        }
        System.out.println(rev);
    }
}
