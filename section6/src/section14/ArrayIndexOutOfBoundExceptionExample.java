package section14;

import java.util.logging.Logger;

public class ArrayIndexOutOfBoundExceptionExample {

    private static final Logger LOGGER = Logger.getLogger(ArrayIndexOutOfBoundExceptionExample.class.getName());

    public static void main(String[] args) {
        try {
            int[] intArray = {1, 2, 3, 4, 5};
            System.out.println(intArray[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            LOGGER.severe("You are trying to access an index does not exist.");
        }

    }

}
