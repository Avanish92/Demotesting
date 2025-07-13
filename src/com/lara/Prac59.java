package com.lara;

public class Prac59 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {1,2,3,4,5,6,9};
        if(arr1.length==arr2.length){
            boolean status = true;
            for (int i = 0; i < arr1.length; i++) {
                for(int j=0; j< arr2.length;j++){
                    if(arr1[i]!=arr2[j]){
                        status=false;
                    }
                }
            }
            if(status=true){
                System.out.println("Arrays are equal");
            }
        }else{
            System.out.println("Arrays are not equal");
        }
    }
}
