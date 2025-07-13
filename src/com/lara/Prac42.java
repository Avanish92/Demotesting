package com.lara;

public class Prac42 {
    public static void main(String[] args) {
        int arr[] = {29,32,76,32,73,47,43};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+",");
                }
            }
        }
    }
}
