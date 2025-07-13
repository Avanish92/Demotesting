package com.lara;

public class Prac150 {
    public static void main(String[] args) {
        String s = "i am avanish pal";
        String[] word = s.split(" ");
        for (int i = 0; i < word.length; i++) {
           Character ch=word[i].charAt(0);
              ch= Character.toUpperCase(ch);
            System.out.print(ch+word[i].substring(1)+" ");

        }

    }
}
