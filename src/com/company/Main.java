package com.company;

public class Main {

    public static void main(String[] args) {
        Animal hippo = new Animal();
        hippo.eat();
        hippo.sleep();

        System.out.println(" ");

        Dog pug = new Dog();
        pug.eat();
        pug.sleep();
        pug.bark();
        pug.setName("King");
        pug.getName();
    }
}
