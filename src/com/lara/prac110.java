package com.lara;

public class prac110 {
    public static void main(String[] args) {
        String s = "Welcome To AutomatioN";
         s= s.replaceAll("\\s","");
        int capitallettr=0;
        int samllletter=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z'){
                capitallettr++;
            }else {
                samllletter++;
            }
        }
        System.out.println(capitallettr);
        System.out.println(samllletter);
    }
}
