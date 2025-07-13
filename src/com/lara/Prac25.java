package com.lara;

public class Prac25 {
    public static void main(String[] args) {
        int firstmax = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        int arr[] = {19,21,28,29,22,89,88};
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>firstmax){
                secondmax = firstmax;
                firstmax=arr[i];
            } else if (arr[i]>secondmax) {
                secondmax=arr[i];
            }
        }
        System.out.println(secondmax);
    }
}
