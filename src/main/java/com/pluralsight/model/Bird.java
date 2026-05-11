package com.pluralsight.model;

//bird is a child-class of the animal class

public class Bird extends Animal {

    @Override
    public void makesSound() {
        System.out.println("Caw Caw");
        System.out.println("Peep");
    }

}
