package com.pluralsight;

public class Dog extends Animal {


    @Override
    void makesSound() {
        System.out.println("Woef Woef");
        System.out.println("Bark");
    }
}