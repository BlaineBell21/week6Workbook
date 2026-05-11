package com.pluralsight.model;

//frog is a child-class of the animal class

public class Frog extends Animal {

    @Override
    public void makesSound() {
        System.out.println("Ribbit Ribbit");
        System.out.println("Croak");
    }
}
