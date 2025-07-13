package com.lara;

public class Prac29 {
    public static void main(String[] args) {
        int arr[] = {89,37,22,92,30};
        int left = 0;
        int right = arr.length-1;
        while (left<right){
            int temp=arr[right];
            arr[right]=arr[left];
            arr[left]=temp;
            left++;
            right--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }
}
