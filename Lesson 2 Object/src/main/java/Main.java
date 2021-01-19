import oop.*;

import java.util.Random;

public class Main {
    // This method returns a random animal.
    public static Animal getRandomAnimal() {
        // Returns a random value 0 or 1.
        int random = new Random().nextInt(2);

        Animal animal = null;
        if (random == 0) {
            animal = new Cat("Tom", 3, 20);
        } else {
            animal = new Mouse("Jerry", 5);
        }
        return animal;
    }

    public static void main(String[] args) {
//        System.out.println("Hello");
//
//        // Instance: Thomas Edison.
//        Person edison = new Person("Thomas Edison", 1847, "USA");
//
//        System.out.println("Info:");
//        System.out.println("Name: " + edison.getName());
//        System.out.println("Born Year: " + edison.getBornYear());
//        System.out.println("Place Of Birth: " + edison.getPlaceOfBirth() + "\n" );
//
//        // Instance: Bill Gates
//        Person billGates = new Person("Bill Gate", 1955, "Seattle, Washington");
//
//        System.out.println("Info:");
//        System.out.println("Name: " + billGates.getName());
//        System.out.println("Born Year: " + billGates.getBornYear());
//        System.out.println("Place Of Birth: " + billGates.getPlaceOfBirth());

        // Create an Animal object.
        // Animal is abstract class,
        // you can not create an object from Animal's Constructor.
//        Animal tom = new Cat("Tom", 3, 20);
//
//        System.out.println("name: " + tom.getName());
//        System.out.println("animalName: " + tom.getAnimalName());
//
//        // Using 'instanceof' operator to
//        // check if an object is an instance of a specific class.
//        boolean isMouse = tom instanceof Mouse;
//        System.out.println("Tom is mouse? " + isMouse);
//
//        boolean isCat = tom instanceof Cat;
//        System.out.println("Tom is cat? " + isCat);
//
//        boolean isAnimal = tom instanceof Animal;
//        System.out.println("Tom is animal? " + isAnimal);

//        Animal animal = getRandomAnimal();
//
//        if (animal instanceof Cat) {
//            // Cast to Cat
//            Cat cat = (Cat) animal;
//
//            // And call a method of the Cat class.
//            System.out.println("Cat height: " + cat.getHeight());
//        } else if (animal instanceof Mouse) {
//            // Cast to Mouse.
//            Mouse mouse = (Mouse) animal;
//
//            // And call method of the Mouse class.
//            System.out.println("Mouse weight: " + mouse.getWeight());
//        }

        Cat cat1 = new Cat("Tom", 3, 20);

        Cat cat2 = new AsianCat("ATom", 2, 19);

        System.out.println("Animal Name of cat1: " + cat1);

        System.out.println("Animal Name of cat2: " + cat2);
    }
}