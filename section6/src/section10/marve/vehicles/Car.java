package section10.marve.vehicles;

import section10.marve.lbase.Vehicle;

public class Car extends Vehicle {

    public int horsePower;
    public String color;
    public String turingRadius;
    public boolean isAutomatic;

    public Car() {
        super("Road");
        System.out.println("Car constructor");
        horsePower = 150;
        color = "Green";
        turingRadius = "3m";
        isAutomatic = false;
    }

    public static void start() {
        System.out.println("Car is starting");
    }

    public void printSuperColor() {
        System.out.println(super.color);
    }

}
