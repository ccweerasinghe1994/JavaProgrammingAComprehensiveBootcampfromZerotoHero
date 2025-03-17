package section10.marve.animals;

import section10.marve.lbase.Animal;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog Eating");
    }

    public void bark() {
        System.out.println("Dog Barking");
    }
}
