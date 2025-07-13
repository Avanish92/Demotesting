package com.lara;

public class Prac22 {
    public static void sencond_max(int arr[]){
        int firstmax = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        for (int num : arr) {
            if(num>firstmax){
                secondmax = firstmax;
                firstmax = num;
            } else if (num>secondmax && num!=firstmax) {
                secondmax = num;
            }
            
        }
        if(secondmax == Integer.MIN_VALUE){
            System.out.println("No 2nd max is there");
        }else {
            System.out.println("Second Maximum:"+secondmax);
        }
    }
    public static void main(String[] args) {
        int[] arr = {28,22,92,75,84};
        sencond_max(arr);
    }
}
