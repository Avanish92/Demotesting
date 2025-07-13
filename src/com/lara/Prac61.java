package com.lara;

public class Prac61 {
    public static void main(String[] args) {
        int arr[] = {23,232,34,3,9};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
               min=arr[i];
            }
        }
        System.out.println(min);
    }
}
