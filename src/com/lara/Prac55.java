package com.lara;

public class Prac55 {
    public static void main(String[] args) {
        int num=45678;
        int count=0;
        while(num>0){
            if(num%10>0){
                count++;
                num/=10;
            }
        }
        System.out.println(count);
    }
}
