package com.lara;

import java.util.Arrays;

public class Prac23 {
    public static void main(String[] args) {
        int[] arr = {2, -3, 5, -1, 0, -7, 8, 4};

        int[] result = new int[arr.length];
        int index = 0;

        for(int num:arr){
            if(num<0){
                result[index++] = num;
            }
        }
        for(int num:arr){
            if(num>=0){
                result[index++] = num;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
