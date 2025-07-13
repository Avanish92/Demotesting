package com.lara;

public class Prac90 {
    public static void main(String[] args) {
        String s1 = "Hello World";
        s1=s1.replaceAll("\\s","");
        int vowels=0,consonants=0;
        for (int i = 0; i <= s1.length()-1; i++) {
            char ch=s1.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                 vowels++;
            }else{
                consonants++;
            }
        }
        System.out.println("Vowels:"+vowels);
        System.out.println("Vowels:"+consonants);
    }
}
