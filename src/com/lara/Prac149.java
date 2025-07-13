package com.lara;

public class Prac149 {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("aaabbccdddd");
        int count=0;
        for (int i = 0; i < sb.length(); i++) {
            for (int j = 0; j < sb.length() ; j++) {
                if(sb.charAt(i)==sb.charAt(j)){
                    count++;
                }

            }
        }
        System.out.println(count);
    }
}
