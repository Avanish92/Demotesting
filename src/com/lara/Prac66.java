package com.lara;

public class Prac66 {
    public static void main(String[] args) {
        String s = "Welcome to the world of java";
        String[] words = s.split(" ");
        String revstring = " ";
        for(String w:words){
            String revword =" ";

                for (int i = w.length()-1; i >=0 ; i--) {
                    revword =revword+w.charAt(i);

            }

            revstring = revstring+revword;

        }
        System.out.println(revstring);


    }
}
