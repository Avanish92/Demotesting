package com.lara;

public class Prac78 {
    public static void main(String[] args) {
        String s ="1234567890a";
        boolean isonlydigits=true;
        for (int i = 0; i < s.length(); i++) {
            char ch  = s.charAt(i);
            if(!(ch>='0' && ch<='9' )){
                isonlydigits=false;
                break;
            }
        }
        if(isonlydigits==true){
            System.out.println("String contains only digit");
        }else {
            System.out.println("String not contains only digit");
        }
    }
}
