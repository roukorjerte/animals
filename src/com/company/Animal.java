package com.company;

import Interfaces.Info;

public class Animal {

    private int id;

    public Animal(){
    }

    public Animal(int id){
        this.id = id;
    }

    public String toString(){
        return String.valueOf(id);
    }

    String name = "Some animal";

    public void eat(){
        System.out.println("I am eating");
    }

    public void sleep(){
        System.out.println("I am sleeping");
    }
}
