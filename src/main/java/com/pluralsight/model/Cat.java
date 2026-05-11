package com.pluralsight.model;

//cat is a child-class of the animal class

public class Cat extends Animal {

    //Polymorphisme (many forms)
    @Override
    public void makesSound() {
        System.out.println("Mrrrrrp");
        System.out.println("Meow");
    }
}