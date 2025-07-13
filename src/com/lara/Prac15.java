package com.lara;

import java.util.Scanner;

public class Prac15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row=1;
        while (row<=n){
            int col=1;

            while (col<=row){
                char ch =(char)('A'+row-1);
                System.out.print(ch++ + " ");
                col++;

            }
            row++;
            System.out.println();
        }
    }
}
