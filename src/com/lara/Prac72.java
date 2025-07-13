package com.lara;

public class Prac72 {
    public static void main(String[] args) {
        int arr[]={29,31,38,23,78,46,23,90};
        int firstmax = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>firstmax){
                     secondmax=firstmax;
                     firstmax=arr[i];
            } else if (arr[i]>secondmax && firstmax !=secondmax) {
                      secondmax=arr[i];
            }

        }
        System.out.println(secondmax);
    }
}
