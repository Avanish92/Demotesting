package com.java.oops;
class Animal{
    Animal(){
        System.out.println("Animal constructor is called");
    }
}
class Dog extends Animal{
    Dog(){
        super();
        System.out.println("Dog Constructor called");
    }
        }
public class Main {
    public static void main(String[] args) {
       Dog d = new Dog();
    }
}
