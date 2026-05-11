package com.pluralsight.model;

//dog is a child-class of the animal class

public class Dog extends Animal {


    @Override
    public void makesSound() {
        System.out.println("Woef Woef");
        System.out.println("Bark");
    }
}