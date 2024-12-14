public class ArithmeticOperations {

    static final double PI_VALUE = 3.14;
    double piValue = 3.14;

    public static void main(String[] args) {
//        Accessing static method sum
        int sum = sum(10, 20);
        System.out.println("Sum of 10 and 20 is: " + sum);

//        Accessing non-static method addition
        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
        int addition = arithmeticOperations.addition(10, 20);
        System.out.println("Addition of 10 and 20 is: " + addition);

//        Accessing static final variable PI_VALUE
        System.out.println("Value of PI is: " + PI_VALUE);

//        Accessing non-static final variable piValue
        System.out.println("Value of PI is: " + arithmeticOperations.piValue);

//        Accessing non-static method subtraction
        int subtraction = arithmeticOperations.subtraction(20, 10);
        System.out.println("Subtraction of 20 and 10 is: " + subtraction);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public int addition(int a, int b) {
//        no restriction on calling static method from non-static method
        subtraction(10, 20);
        sum(10, 20);
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }
}
