package it.develhope.polymorphism;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

    System.out.println("--------------Starting--------------");

    Scanner scanner = new Scanner(System.in);

    Animal animal = new Animal(scanner);
    animal.animalSound();

    System.out.println("------------------------------------");

    Lion lion = new Lion(scanner);
    lion.animalSound();

    System.out.println("------------------------------------");

    Cow cow = new Cow(scanner);
    cow.animalSound();

    System.out.println("------------------------------------");

    }

}


