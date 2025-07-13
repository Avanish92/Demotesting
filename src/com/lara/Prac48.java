package com.lara;

public class Prac48 {
    public static void main(String[] args) {
        int[] arr = {23,92,99,44,74,65,44};
        int firstmax = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>firstmax){
                secondmax = firstmax;
                firstmax=arr[i];
            } else if (arr[i]>secondmax) {
                secondmax=arr[i];
            }
        }
        System.out.println(secondmax);
    }
}
