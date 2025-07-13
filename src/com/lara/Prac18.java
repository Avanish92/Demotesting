package com.lara;

public class Prac18 {
    public  static void max(int arr[]){
       int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum Element:"+max);
    }
    public static void main(String[] args) {
        int arr[] = {22,67,89,45,39,45};
        max(arr);

    }
}
