package com.lara;

public class Prac21 {
    public static void main(String[] args) {
        int firstmax = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        int arr[] = {82,29,23,74,92,31};
        for(int num:arr){
            if(num>firstmax){
                secondmax = firstmax;
                 firstmax = num;
            } else if (num>secondmax && num!=firstmax) {
                      secondmax  = num;
            }
        }
        if(secondmax == Integer.MIN_VALUE){
            System.out.println("No second max found");
        }else {
            System.out.println("Second Maximum:"+secondmax);
        }
    }
}
