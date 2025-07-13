package com.lara;

import java.util.Scanner;

public class Prac9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();
        int i=1;
        while(i<=n){
            int j=1;
            while (j<=i){
                System.out.print("*");
                j=j+1;
            }
            i=i+1;
            System.out.println();
        }

    }
}
