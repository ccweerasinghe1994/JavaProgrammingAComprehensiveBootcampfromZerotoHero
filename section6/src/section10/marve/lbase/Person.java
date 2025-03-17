package section10.marve.lbase;

public class Person {

    protected String name;

    protected int age;

    public void eat(String food) {
        System.out.println("Person Eating " + food);
    }

    public void walking() {
        System.out.println("Person Walking");
    }

    public void sleeping() {
        System.out.println("Person Sleeping");
    }
}
