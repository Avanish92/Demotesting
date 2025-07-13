package com.lara;

import java.util.Arrays;
import java.util.Scanner;

public class Prac69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st String");
        String str1 = sc.next();
        System.out.println("Enter the 2nd String");
        String str2 = sc.next();
        str1 = str1.replaceAll("\\s","").toLowerCase();
        str2 = str2.replaceAll("\\s","").toLowerCase();
        if(str1.length()!=str2.length()){
            System.out.println("Not An Anagrams");
        }else{
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if(Arrays.equals(ch1,ch2)){
                System.out.println("Anagram");
            }else {
                System.out.println("Not an Angaram");
            }
        }

    }
}
