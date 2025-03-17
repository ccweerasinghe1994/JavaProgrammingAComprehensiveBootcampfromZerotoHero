package section10.marve.app;

import section10.marve.lbase.Person;

public class Main {
    public static void main(String[] args) {
//        IronMan man = new IronMan();
//
//        man.eat("Pizza");
//        man.usePower();
//        man.sleeping();
//        man.walking();

        Person person = new Person();
        int i = person.hashCode();
        System.out.println(i);
    }
}
