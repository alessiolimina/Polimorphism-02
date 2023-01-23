package it.develhope.polymorphism;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

    System.out.println("------------Starting-----------------");

    System.out.println("Type an animal: ");

    Scanner scanner = new Scanner(System.in);

    Animal animal = new Animal(scanner.nextLine());
    System.out.println("You typed '" + animal.animalName + "'. What's his sound?");
    animal.animalSound();

    System.out.println("------------------------------------");

    System.out.println("Type an animal: ");

    Lion lion = new Lion(scanner.nextLine());
    System.out.println("You typed '" + lion.animalName  + "'. What's his sound?");
    lion.animalSound();

    System.out.println("------------------------------------");

    System.out.println("Type an animal: ");

    Cow cow = new Cow(scanner.nextLine());
    System.out.println("You typed '" + cow.animalName + "'. What's her sound?");
    cow.animalSound();

    System.out.println("------------------------------------");

    }

}


