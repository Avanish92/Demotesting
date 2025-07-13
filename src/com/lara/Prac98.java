package com.lara;

import java.util.HashMap;
import java.util.Map;

public class Prac98 {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,3,3};
        Map<Integer,Integer> m1 = new HashMap<>();
        for(int num:arr){
            m1.put(num, m1.getOrDefault(num,0)+1);
        }
        System.out.println(m1);
    }
}
