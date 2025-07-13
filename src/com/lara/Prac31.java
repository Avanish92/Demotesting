package com.lara;

public class Prac31 {

    public static void main(String[] args) {
        int arr[] = {1,2,0,4,3,0,5,0};
        int n = arr.length;
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        while(j<n){
            arr[j++]=0;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }
}
