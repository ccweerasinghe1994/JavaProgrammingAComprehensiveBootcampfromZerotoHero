package section14;

import java.util.Scanner;

public class CustomCheckedException {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("enter the first number");
        double firstNumber = scanner.nextDouble();

        System.out.println("enter the second number");
        double secondNumber = scanner.nextDouble();

        if (secondNumber == 0) {
            throw new DivideByZeroException("Second number cannot be zero");
        }

        System.out.println("Result: " + firstNumber / secondNumber);

    }
}
