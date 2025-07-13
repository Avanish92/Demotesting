package com.lara;

import java.util.Scanner;

public class Prac14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        char ch = 'A';
        while (row<=n){
            int col = 1;

            while (col<=n){
                System.out.print(ch + " ");
                ch++;
                col++;

            }
            row++;
            System.out.println();
        }
    }
}
