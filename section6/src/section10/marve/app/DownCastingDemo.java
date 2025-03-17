package section10.marve.app;

import section10.marve.animals.Cat;
import section10.marve.animals.Dog;
import section10.marve.lbase.Animal;

public class DownCastingDemo {

    public static void main(String[] args) {

        Animal animal;
        Cat cat = new Cat();

        animal = cat; // Upcasting
        cat = (Cat) animal; // Downcasting
        AnimalUtility.peformAction(cat);

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            AnimalUtility.peformAction(dog);
        }
    }


}
