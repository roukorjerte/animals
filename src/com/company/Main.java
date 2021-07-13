package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal(0));
        listOfAnimals.add(new Animal(1));

        test(listOfAnimals);

   //     List<Animal> listOfDogs = new ArrayList<>();
   //     listOfDogs.add(new Dog(2));
   //     listOfDogs.add(new Dog(3));

   //     test(listOfDogs);

        Animal animal1 = new Animal();

        Animal animal2 = new Animal(){
          public void eat(){
              System.out.println("Other animal is eating");
          }
        };

        animal1.eat();
        animal2.eat();
    }

    private static void test(List<Animal> list){
        for(Animal animal : list){
            System.out.println(animal);
        }
    }
}
