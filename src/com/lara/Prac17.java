package com.lara;

public class Prac17 {
    public static void main(String[] args) {
        int arr[] = {23,74,78,41};
        int start =0, end=arr.length-1;
        while (start<=end){
            int temp= arr[start];
            arr[start] =arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        }
    }

