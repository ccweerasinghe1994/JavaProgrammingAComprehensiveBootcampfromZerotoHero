package section10.marve.app;

import section10.marve.lbase.Vehicle;
import section10.marve.vehicles.Car;

public class MethodHidingDemo {
    public static void main(String[] args) {
        Vehicle.start();
        Car.start();

        Vehicle vehicle = new Car();
        vehicle.start();

        Car car = new Car();
        car.start();

        Vehicle vehicle2 = new Car();
        vehicle2.start();

        Car car2 = (Car) vehicle;
        car2.start();

        ((Vehicle) car2).start();

    }
}
