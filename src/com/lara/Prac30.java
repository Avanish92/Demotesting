package com.lara;

public class Prac30 {
    public static void pushzerotoend(int[] arr){
        int nonzeroindex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                int temp = arr[nonzeroindex];
                arr[nonzeroindex] = arr[i];
                arr[i]=temp;
                nonzeroindex++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={9,0,6,4,2,8,0,2,8,3,0,4,2,8,2,0,2,3,0,2};
        pushzerotoend(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }
}
