package section14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean isRunning = true;

        while (isRunning) {
            try {
                System.out.print("Enter a number: ");
                int number = scanner.nextInt();
                System.out.println("You entered: " + number);
                isRunning = false;
            } catch (InputMismatchException e) {
//                e.printStackTrace();
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }


    }
}
