package it.develhope.polymorphism;

import java.util.Scanner;

public class Animal {
    Scanner animalName = new Scanner(System.in);

    public Animal(Scanner animalName){

        System.out.println("Creating a new animal: ");

        String name = animalName.nextLine();

        System.out.printf("The animal is %s %n", name);

    }

    public void animalSound(){
        System.out.println("Default animal sound");
    }
}




