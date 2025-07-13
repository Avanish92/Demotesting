package com.lara;

import java.util.HashSet;
import java.util.Set;

public class Prac82 {
    public static void main(String[] args) {
        int arr[]= {6,3,5,2,6,2,7,3,2,6};

        Set s= new HashSet<>();
        Set duplicate = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(!s.add(arr[i])){
                duplicate.add(arr[i]);
            }
        }
        System.out.println(duplicate);
    }
}
