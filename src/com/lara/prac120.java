package com.lara;

public class prac120 {
    public static void main(String[] args) {
        int a =0,b=1;
        System.out.print(a+" "+b);
        int sum=0;
        for (int i = 2; i < 10; i++) {
            sum=a+b;
            System.out.print(" "+sum);
            a=b;
            b=sum;
        }

    }
}
