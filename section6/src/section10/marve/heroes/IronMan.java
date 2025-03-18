package section10.marve.heroes;

import section10.marve.lbase.Person;

public class IronMan extends Person {

    @Override
    public void walking() {
        System.out.println("IronMan walking");
    }

    public void usePower() {
        System.out.println("IronMan using power");
    }

    @Override
    public void eat(String food) {
        super.eat(food);
        System.out.println("IronMan Eating " + food);
    }

    public void callSuperEat() {
        super.eat("Pizza");
    }
}
