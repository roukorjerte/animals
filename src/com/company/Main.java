package com.company;

public class Main {

    public static void main(String[] args) {
        Animal hippo = new Animal();
        Animal clifford = new Dog();
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        hippo.eat();
        hippo.sleep();

        System.out.println(" ");

        Dog pug = new Dog();
        pug.eat();
        pug.sleep();
        pug.bark();
        pug.setName("King");
        pug.getName();

        clifford.eat();

        test(animal);
        test(cat);
        test(dog);
    }

    public static void test (Animal animal){
        animal.eat();
    }
}
