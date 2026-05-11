package com.pluralsight;

public class Cat extends Animal  {

    //Polymorphisme (many forms)
    @Override
    void makesSound() {
        System.out.println("Mrrrrrp");
        System.out.println("Meow");
    }
}