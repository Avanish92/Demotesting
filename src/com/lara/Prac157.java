package com.lara;

public class Prac157 {
    public static String CamelCase(String str){
        String[] word = str.split(" ");
        String res="";
//        for (int i = 0; i < word.length; i++) {
//            Character ch = word[0].charAt(0);
//            ch=Character.toUpperCase(ch);
//            res = ch+word[i].substring(1)+" ";
            for (int i = 0; i < word.length; i++) {
                Character ch=word[i].charAt(0);
                ch= Character.toUpperCase(ch);
                 res =res+ ch+word[i].substring(1)+" ";

        }
        return res;
    }
    public static void main(String[] args) {
         String str = "i am avanish pal";
        System.out.println(CamelCase(str));
    }
}
