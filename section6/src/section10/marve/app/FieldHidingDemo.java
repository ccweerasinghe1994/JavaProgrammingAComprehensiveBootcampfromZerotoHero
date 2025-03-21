package section10.marve.app;

import section10.marve.lbase.Vehicle;
import section10.marve.vehicles.Car;

public class FieldHidingDemo {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("All");

        System.out.println(vehicle.horsePower);
        System.out.println(vehicle.color);
        System.out.println(vehicle.turingRadius);

        Car car = new Car();

        System.out.println(car.horsePower);
        System.out.println(car.color);
        System.out.println(car.turingRadius);
        System.out.println(car.isAutomatic);
    }
}
