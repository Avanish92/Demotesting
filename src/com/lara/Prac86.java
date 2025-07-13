package com.lara;

import java.util.HashMap;
import java.util.Map;

public class Prac86 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 3, 3};
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        System.out.println(map);
    }
}
