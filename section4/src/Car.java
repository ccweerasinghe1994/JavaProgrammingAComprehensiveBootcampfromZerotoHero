public class Car {
    String model;
    String color;
    int horsePower;

    {
        model = "Toyota";
        color = "Red";
        horsePower = 200;
        System.out.println("Car object created!");
    }

    public void startCar() {
        System.out.println("Car is starting...");
    }

    public String stopCar() {
        String output = "Car is stopping...";
        return output;
    }
}
