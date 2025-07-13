package com.lara;

import java.util.Arrays;

public class Prac58 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2 ={1,2,3,4,5};
        boolean status = Arrays.equals(arr1, arr2);
        System.out.println(status);
        if(status==true){
            System.out.println("Arrys are equal");
        }else{
            System.out.println("Arrays are not equal" );
        }
    }
}
