package com.lara;

public class Prac54 {
    public static void main(String[] args) {
        int num = 1221;
        int rev = 0;
        int temp = num;
        while (num > 0) {
          rev = (rev*10)+num%10;
          num/=10;
        }
        if(temp==rev){
            System.out.println(temp+" Plaindrome");
        }else {
            System.out.println(temp+" Not a Plaindrome");
        }
    }

}
