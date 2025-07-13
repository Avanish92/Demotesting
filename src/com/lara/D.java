package com.lara;

public class D {

    public static void main(String[] args) {
       int arr[] = {10,9,20,8,40,50,60};
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>largest){
                second_largest = largest;
                largest = arr[i];
            } else if (arr[i]>second_largest) {
                second_largest = arr[i];
            }
        }
        System.out.println(second_largest);
    }
}
