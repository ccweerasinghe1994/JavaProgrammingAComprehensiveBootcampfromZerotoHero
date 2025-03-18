package section10.marve.app;

import section10.marve.heroes.IronMan;
import section10.marve.lbase.Person;

public class DynamiPolymorphisum {

    public static void main(String[] args) {
        Person person = new Person();

        person = new IronMan(); // Upcasting
        person.walking(); // this is dynamic polymorphism
        person.eat("Dynami");

        IronMan ironMan = new IronMan();

        ironMan.callSuperEat();

    }
}
