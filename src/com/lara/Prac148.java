package com.lara;

public class Prac148 {
    public static void main(String[] args) {
        String s = "Welcome to java";
        int countword=0;
        String[] words=s.split(" ");
       for(int i=0;i<words.length;i++){
           countword++;
        }
        System.out.println("Total word:"+ countword);
    }
}
