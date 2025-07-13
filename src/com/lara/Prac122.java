package com.lara;

public class Prac122 {
    public static int  maxele(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static  int minele(int[] arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {17,12,26,30,56};
        int max = maxele(arr);
        int min = minele(arr);
        System.out.println("max:"+max);
        System.out.println("min:"+min);
    }
}
