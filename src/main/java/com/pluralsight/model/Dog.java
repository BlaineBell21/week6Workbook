package com.pluralsight.model;



public class Dog extends Animal {

//The dog is a Child-class (a.k.a. subclass from Animal)


    public Dog(String _name) {
       super(_name); //Calls animal constructor
       this.setName(_name);
    }

    @Override
    public void makeSound() {
       System.out.print(getName() + "says WOEF");
    }

}