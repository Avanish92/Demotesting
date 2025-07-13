package com.lara;

public class Prac126 {
    public static void main(String[] args) {
        String s= "absjsjs&*%$#%aass&^%$##ghashas";
        s=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);
    }
}
