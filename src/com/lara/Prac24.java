package com.lara;

public class Prac24 {
    public static void duplicate(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+",");
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 1, 0, 5, 4, 3, 4,5};
        duplicate(arr);
    }
}
