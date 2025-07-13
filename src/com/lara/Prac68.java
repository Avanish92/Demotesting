package com.lara;

public class Prac68 {
    public static void main(String[] args) {
        String s = "My name is Avanish Pal";
        int vowels = 0,consonents=0;
        s=s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z'){
                if(ch =='a' || ch =='e' || ch=='i' || ch=='o' || ch=='u' ){
                    vowels++;
                }else {
                    consonents++;
                }
            }

        }
        System.out.println("Vowels: " + vowels + " Consonets: "+ consonents);
    }
}
