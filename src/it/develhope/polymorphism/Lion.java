package it.develhope.polymorphism;

import java.util.Scanner;

public class Lion extends Animal{


    public Lion(Scanner animalName) {
        super(animalName);
    }

    @Override
    public void animalSound() {
        System.out.println("Roarrrr!!!");
    }
}

