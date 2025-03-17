package section10.marve.lbase;

public class Person {

    public static int numOfHands = 2;
    protected String name;
    protected int age;

    protected void calculateAge(int yearOfBirth) {
        System.out.println("Person Age: ");
    }


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
