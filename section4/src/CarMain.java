public class CarMain {
    static {
        System.out.println("CarMain class static block executed!");
    }

    public static void main(String[] args) {
        System.out.println("CarMain class main method started!");
        Car car1 = new Car();
        Car car2 = new Car("Honda", "Blue", 150);
        System.out.println(Car.NO_OF_WHEELS);
    }
}
