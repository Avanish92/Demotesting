package com.lara;

public class Prac77 {
    public static void main(String[] args) {
        String s = "programming";
        String check = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(check.indexOf(ch)!=-1){
                continue;
            }
             int count=0;
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j)==ch){
                 count++;
                }
            }
            check = check+ch;
            System.out.println(ch+" : "+count);
        }
    }
}
