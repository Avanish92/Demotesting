package com.lara;

public class Prac146 {
    public static void main(String[] args) {
        String s = "programming";
        String checked="";
        for (int i = 0; i < s.length(); i++) {
            char currentchar = s.charAt(i);
            if(checked.indexOf(currentchar)!=-1){
                continue;
            }
            int count=0;
            for (int j = 0; j < s.length(); j++){
                if(s.charAt(j)==currentchar){
                    count++;
                }
            }
            System.out.println(currentchar + " = " + count);
            checked += currentchar;
        }
    }
}
