package com.lara;

import java.util.Scanner;

public class Prac8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int count = 1;
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print(count+" ");
                j++;
                count++;
            }
            i++;
            System.out.println();
        }
    }
}
