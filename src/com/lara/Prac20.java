package com.lara;

import java.util.Arrays;

public class Prac20 {
    public static void sorting(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("Bubble sort"+ Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[] = {83,38,23,72,63};
        sorting(arr);

    }
}
