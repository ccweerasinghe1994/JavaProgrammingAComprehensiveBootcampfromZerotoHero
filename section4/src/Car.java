public class Car {
    static final byte NO_OF_WHEELS = 4;
    static int numberOfEngine;

    static {
        System.out.println("Car class loaded!");
        numberOfEngine = 1;
    }

    String model;
    String color;
    int horsePower;

    {
        System.out.println("Car object created!");
    }

    public Car() {
        this("Toyota", "Red", 200);
    }

    public Car(String model, String color, int horsePower) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public void startCar() {
        System.out.println("Car is starting...");
    }

    public String stopCar() {
        String output = "Car is stopping...";
        return output;
    }
}
