package com.lara;

import java.util.*;

public class Prac32 {
    public static void main(String[] args) {
        String arr[] = {"red","blue","green"};
        //1st way to convert into ArrayList
//        List<String> li = Arrays.asList(arr);
//        System.out.println(li);
// 2nd way to convert Array to list.
//            List<String> li = new ArrayList<>();
//        Collections.addAll(li,arr);
//        System.out.println(li);
//3rd way to converting Array to Arraylist.
        List<String> li = new ArrayList<>();
            for (String s:arr){
                li.add(s);
            }
        System.out.println(li);
    }
}
