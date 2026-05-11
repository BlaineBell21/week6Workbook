package com.pluralsight.model;

//this is the super class

public abstract class Animal {
    private String name;
    private int age;

    void eat(){
        System.out.println("This animal is eating");
    }
    void makesSound(){
        System.out.println("This animal is talking");
    }

}
