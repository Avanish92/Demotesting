package com.lara;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Prac104 {
    public static void main(String[] args) {
        String s1 = "java pytnhon";
        Set s = new HashSet();
        for (int i = 0; i < s1.length(); i++) {
            s.add(s1.charAt(i));
        }
        Iterator i = s.iterator();
        while (i.hasNext()){
            System.out.print(i.next()+" ");
        }


    }
}
