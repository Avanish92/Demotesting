package com.lara;

import java.util.Scanner;

public class Prac13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row =1;
        while (row<=n){//1<=5
            int col = 1;
            while (col<=n){//1<=5
                char ch =(char)('A'+col-1);//
                System.out.print(ch+" ");
                col++;
            }
            row++;
            System.out.println();
        }
    }
}
