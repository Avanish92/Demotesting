package com.lara;

import java.util.Arrays;

public class Prac103 {
    public static void main(String[] args) {
        String s = "java is fun";
        String res = "";
        String[] words = s.split(" ");

        for(String word :words){
            String revword="";

            for (int i = word.length()  -1; i >=0 ; i--) {

                    revword += word.charAt(i);


            }
            res+=revword+" ";
        }
        System.out.println(res);
    }
}
