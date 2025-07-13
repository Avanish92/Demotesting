package com.lara;

public class Prac156 {
   public static boolean ispalindrome(String s){
        int start = 0,end=s.length()-1;
        while (start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return  false;
            }
            start++;
            end--;
        }
        return  true;
    }
    public static void main(String[] args) {
        String s = "madam";
       boolean b= ispalindrome(s);
        System.out.println(b);
    }
}
