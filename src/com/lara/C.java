package com.lara;

public class C {
    public static void main(String[] args) {
        int n = 153;
        int digit = 0;
        int cube=0;
        int ans=0;
        int temp=n;
        while (n!=0){
             digit = n%10;
            cube=digit*digit*digit;
              ans =ans+cube;

            n=n/10;
        }
        if(temp==ans){
            System.out.println("The number is armstrong");
        }else {
            System.out.println("The number is not armstrong");
        }
    }
}
