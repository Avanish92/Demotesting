package com.lara;
class A1{

    public void method1(){
        System.out.println("I am from class A1");
    }

}
class B1 extends A1{
    public void method2(){
        System.out.println("I am from class B1");
    }
}
public class Main {
    public static void main(String[] args) {
        B1 b1= new B1();
        b1.method1();
        b1.method2();
    }

}
