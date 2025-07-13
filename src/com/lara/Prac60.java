package com.lara;

public class Prac60 {
    public static void main(String[] args) {
        int arr[] = {27,37,30,22,321,87,3};
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
