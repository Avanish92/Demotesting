package com.lara;

public class Prac79 {
    public static void main(String[] args) {
        int arr[] = {2, 5, 2, 8, 5, 6, 8, 8, 6};
        boolean[] visited = new boolean[arr.length];
        System.out.println("Element : Frequency");
        for (int i = 0; i < arr.length; i++) {
            if(visited[i]){
                continue;
            }
            int count=1;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println(arr[i]+":"+count);
        }
    }
}
