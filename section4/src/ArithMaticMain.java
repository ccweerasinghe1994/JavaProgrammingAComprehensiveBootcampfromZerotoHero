public class ArithMaticMain {
    public static void main(String[] args) {
//        Accessing static method sum
        int sum = ArithmeticOperations.sum(10, 20);
        System.out.println("Sum of 10 and 20 is: " + sum);

//        Accessing non-static method addition
        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
        int addition = arithmeticOperations.addition(10, 20);
        System.out.println("Addition of 10 and 20 is: " + addition);

//        Accessing static final variable PI_VALUE
        System.out.println("Value of PI is: " + ArithmeticOperations.PI_VALUE);

//        Accessing non-static final variable piValue
        System.out.println("Value of PI is: " + arithmeticOperations.piValue);

//        Accessing non-static method subtraction
        int subtraction = arithmeticOperations.subtraction(20, 10);
        System.out.println("Subtraction of 20 and 10 is: " + subtraction);
    }
}
