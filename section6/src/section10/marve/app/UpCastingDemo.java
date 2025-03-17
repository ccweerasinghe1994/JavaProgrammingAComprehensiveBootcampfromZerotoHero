package section10.marve.app;

import section10.marve.animals.Cat;
import section10.marve.animals.Dog;
import section10.marve.lbase.Animal;

public class UpCastingDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("Scooby");

        AnimalUtility.printName(animal);

        animal = new Dog();
        animal.setName("Scooby Doo");

        AnimalUtility.printName(animal);


        Cat cat = new Cat();
        cat.setName("Tom");

        AnimalUtility.printName(cat);
    }
}
