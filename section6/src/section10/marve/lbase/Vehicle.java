package section10.marve.lbase;

public class Vehicle {

    public int horsePower;
    public String color;
    public double turingRadius;
    public String madeFor;

    public Vehicle(String madeFor) {
        System.out.println("Vehicle constructor");
        horsePower = 100;
        color = "Red";
        turingRadius = 10;
        this.madeFor = madeFor;

    }

    public static void start() {
        System.out.println("Vehicle is starting");
    }
}
