package com.lara;

public class Prac116 {
    public static void main(String[] args) {
        int num=1234856567;
        int digit=0;
        while(num>0){
            if(num%10!=0)
                digit++;
            num/=10;
        }
        System.out.println(digit);
    }
}
