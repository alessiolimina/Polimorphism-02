package it.develhope.polymorphism;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

    System.out.println("------------Starting-----------------");
    System.out.println("Type an animal: ");

    Scanner scanner = new Scanner(System.in);

    Animal animal = new Animal(scanner.nextLine());
    animal.animalSound();

    System.out.println("------------------------------------");

    System.out.println("Type an animal: ");
    Lion lion = new Lion(scanner.nextLine());
    lion.animalSound();

    System.out.println("------------------------------------");

    System.out.println("Type an animal: ");
    Cow cow = new Cow(scanner.nextLine());
    cow.animalSound();

    System.out.println("------------------------------------");

    }

}


