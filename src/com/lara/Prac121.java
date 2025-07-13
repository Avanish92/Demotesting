package com.lara;

public class Prac121 {
    public static void main(String[] args) {
        int a=10;
        int b=30;
        int c=50;
        if(a>b && a>c){
            System.out.println("Biggest number: "+a);
        } else if (b>a && b>c) {
            System.out.println("Biggest number: "+b);
        }else {
            System.out.println("Biggest number: "+c);
        }
    }
}
