package it.develhope.polymorphism;

public class Start {
    public static void main(String[] args) {

    System.out.println("--------------Starting--------------");

    Animal animal = new Animal();
    animal.animalSound();

    System.out.println("------------------------------------");

    Lion lion = new Lion();
    lion.animalSound();

    System.out.println("------------------------------------");

    Cow cow = new Cow();
    cow.animalSound();

    System.out.println("------------------------------------");

    }

}


