package it.develhope.polymorphism;

public class Animal {
    public String animalName;
    public Animal(){
        this.animalName = "animal";
        System.out.println("Creating a new " + animalName + "...guess what?");
    }
    public void animalSound(){
        System.out.println("Default animal sound");
    }

}
