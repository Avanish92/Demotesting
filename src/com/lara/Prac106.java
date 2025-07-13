package com.lara;

public class Prac106 {
    public static void main(String[] args) {
        int[] arr={32,54,67,98,80,76,59};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
