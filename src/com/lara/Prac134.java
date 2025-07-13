package com.lara;

public class Prac134 {
    public static void main(String[] args) {
        String s = "Welcome to java";
        String[] words = s.split(" ");
        String result="";

        for(String word:words){
            String revword="";

            for (int i = word.length()-1; i >=0 ; i--) {
                if(word.length()>3) {
                    revword += word.charAt(i);
                }else{
                    revword=word;
                }
            }
            result+=revword+" ";
        }

        System.out.println(result.trim());
    }
}
