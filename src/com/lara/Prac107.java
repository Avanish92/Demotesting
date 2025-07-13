package com.lara;

public class Prac107 {
    public static  int min_array(int[] arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = {76,27,32,83,29,23};
        int min = min_array(arr);

            System.out.println(min);
        }
    }

