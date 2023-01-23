package it.develhope.polymorphism;

import java.util.Scanner;

public class Cow extends Animal{

    public Cow(String animalName) {
        super(animalName);
    }

    @Override
    public void animalSound() {
        System.out.println("Mooooh!!!");
    }
}

