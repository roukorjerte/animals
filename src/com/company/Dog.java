package com.company;

public class Dog extends Animal {

    public Dog(int id) {
        super(id);
    }

    public void bark(){
        System.out.println("I am barking");
    }

    public void eat(){
        System.out.println("Dog is eating");
    }

    public void getName(){
        System.out.println("Dog name is " +name);
    }

    public void setName(String name){
        this.name = name;
    }
}
