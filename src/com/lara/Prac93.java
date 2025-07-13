package com.lara;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Prac93 {
    public static void main(String[] args) {
        String s1 = "Prgramming";
        Set se = new HashSet();
        for (int i = 0; i < s1.length(); i++) {
            se.add(s1.charAt(i));
        }
        Iterator<Character> iterator = se.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }
}
