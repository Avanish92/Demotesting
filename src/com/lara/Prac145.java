package com.lara;

import java.util.HashMap;
import java.util.Map;

public class Prac145 {
    public static void main(String[] args) {
        String s = "abcbabcbaba";
        Map<Character,Integer> m1 = new HashMap();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(m1.containsKey(ch)){
                m1.put(ch,m1.get(ch)+1);
            }else{
                m1.put(ch,1);
            }
        }
        for (Map.Entry<Character, Integer> entry : m1.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
