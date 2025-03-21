package section10.marve.app;

import section10.marve.heroes.IronMan;

public class StaticPolymorphisum {

    public static void main(String[] args) {

        IronMan ironMan = new IronMan();

        ironMan.eat("Pizza");
        ironMan.eat("Pizza", "Coke");

    }
}
