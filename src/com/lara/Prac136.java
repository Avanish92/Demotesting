package com.lara;

public class Prac136 {
    public static void main(String[] args) {
    String s = "My Name Is lov Avanish";
    String[] words = s.split(" ") ;
    String res="";
    for(String word : words) {
        String revword="";
        for (int i = word.length()-1; i >=0 ; i--) {
            if(word.length()>3){
                revword+=word.charAt(i);
            }else{
                revword=word;
            }

        }
        res+=revword+" ";

    }
        System.out.println(res.trim());
    }
}
