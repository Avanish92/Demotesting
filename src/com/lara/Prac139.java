package com.lara;

import java.util.Arrays;

public class Prac139 {
    public static void main(String[] args) {
        String s = "abc,123@xyz";
        String[] arr1 = s.split(",");
        String[] arr2 = arr1[1].split("@");
        System.out.println((arr1[0]));
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);

    }
}
