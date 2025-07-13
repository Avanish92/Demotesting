package com.lara;

import java.util.HashSet;
import java.util.Set;

public class Prac81 {
    public static void main(String[] args) {
        int[] arr= {4, 5, 6, 7, 4, 5, 8, 9, 6};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for(int num:arr){
            if(!seen.add(num)){
                duplicates.add(num);
            }
        }
        System.out.println("Duplicate Elements:"+duplicates);
    }
}
