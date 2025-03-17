package section10.marve.app;

import section10.marve.animals.Cat;
import section10.marve.animals.Dog;
import section10.marve.lbase.Animal;

public class AnimalUtility {
    public static void printName(Animal animal) {
        System.out.println("Animal Name: " + animal.getName());
    }

    public static void peformAction(Animal animal) {
        animal.eat();

        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.meow();
        }

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.bark();
        }
    }
}
