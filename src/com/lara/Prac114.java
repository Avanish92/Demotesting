package com.lara;

public class Prac114 {
    public static void main(String[] args) {
        int[] arr={3,4,5,6};
        int[] arr2={3,4,5,6};
        boolean b = false;
        if(arr.length==arr2.length){
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if(arr[i]==arr2[j]){
                        b=true;
                    }
                }
            }
            if(b==true){
                System.out.println("Arrays are equal");
            }else {
                System.out.println("Arrays are not equal");
            }
        }
    }
}
