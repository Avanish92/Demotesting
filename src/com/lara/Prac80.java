package com.lara;

import java.util.HashMap;
import java.util.Map;

public class Prac80 {
    public static void main(String[] args) {
        int arr[] = {2, 5, 2, 8, 5, 6, 8, 8, 6};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println("Element: Frquency");
        for(int key:map.keySet()){
            System.out.println(key+":"+map.get(key));
        }
    }
}
