package com.lara;

public class Prac115 {
    public static void main(String[] args) {
        int[] arr ={12,83,73,63,43};
        int even=0;
        int odd=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("Even:"+ even);
        System.out.println("Odd:"+odd);
    }
}
