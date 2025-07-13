package com.lara;

public class Prac152 {
    public static void main(String[] args) {
        String s = "I love to code";
        String[] word= s.split(" ");
        int maxwordlength=0;
        for (int i = 0; i < word.length; i++) {

            if(maxwordlength<word[i].length()){
                maxwordlength=word[i].length();
            }
        }
        System.out.println(maxwordlength);
    }
}
