package com.lara;

public class Prac99 {
    public static void main(String[] args) {
        String s = "avanbibsh";
        for (int i = 0; i <= s.length()-1; i++) {
            char ch=s.charAt(i);//a
                  System.out.print(s.indexOf(ch));//010345478
                  System.out.print(s.lastIndexOf(ch));//212365678

            if(s.indexOf(ch) != s.lastIndexOf(ch)) {//1
                if (s.indexOf(ch) == i) {
                    System.out.println("Duplicate character:" + ch);
                }
             }
            }

        }
    }

