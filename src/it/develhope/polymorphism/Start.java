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


/*define a class Animal that has:
an instance variable animalName
a constructor that instantiate animalName
a method animalSound() that prints default animal sound
define a subclass Lion
define a subclass Cow
achieve polymorphism by using method overriding on animalSound(), printing the right sounds
define a tester class where you:
create an Animal object
create a Lion object
create a Cow object
executes the animalSound() method on all the 3 objects*/