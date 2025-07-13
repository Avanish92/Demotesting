package com.lara;

public class Prac130 {
    public static void main(String[] args) {
        String s = "I love Coding";
        String[] words = s.split("//s+");
        String result="";
        for(String word : words){
            String reversedWord="";
            for (int i = word.length()-1; i >=0 ; i--) {
                if(word.length()>3) {
                    reversedWord = reversedWord.concat(String.valueOf(word.charAt(i)));
                }
            }
            result=result.concat(reversedWord+" ");
        }
        result=result.trim();
        System.out.println(result);
    }
}
