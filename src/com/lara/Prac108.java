package com.lara;

public class Prac108 {
    public static void main(String[] args) {
        int[] arr = {32,87,82,31,89,29};
        int even=0,odd=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Even Numbers:");
            if(arr[i]%2==0){
                System.out.println(arr[i]+" ");
            }
            if(arr[i]%2!=0){

                System.out.println(arr[i]+" ");
            }
        }
    }
}
