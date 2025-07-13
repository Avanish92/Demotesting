package com.lara;

public class Prac118 {
    public static void main(String[] args) {
        int arr[] = {62,51,27,12,81,62,27};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }

    }
}
