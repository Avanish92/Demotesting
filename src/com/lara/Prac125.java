package com.lara;

public class Prac125 {
    public static void main(String[] args) {
        int num=14;
        if(num>=1){
            int count=0;
            for (int i = 1; i <= num; i++) {

                if(num%i==0) {
                    count++;
                }
            }
            if(count==2){
                System.out.println("prime number");
            }else {
                System.out.println("Not a prime number");
            }
        }else{
            System.out.println("Not a Prime");
        }
    }

}
