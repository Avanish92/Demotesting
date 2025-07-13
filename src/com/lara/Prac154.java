package com.lara;

public class Prac154 {
    public static void main(String[] args) {
        String s = "I love coding";
        String[] words = s.split("\\s+");
        for(int i=words.length-1;i>=0;i--){
            System.out.print(words[i]+" ");
        }
    }
}
