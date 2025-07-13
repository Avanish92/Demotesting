package com.lara;

public class Prac19 {
    public  static void min(int arr[]){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }

        }
        System.out.println(min);
    }
    public static void main(String[] args) {
        int arr[] = {65,83,93,23,1,26,87,2};
        min(arr);
    }
}
