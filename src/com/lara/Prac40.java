package com.lara;

public class Prac40 {

    public static void main(String[] args) {
        int arr[] = {300,93,27,32,38,290,23,100,130};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
