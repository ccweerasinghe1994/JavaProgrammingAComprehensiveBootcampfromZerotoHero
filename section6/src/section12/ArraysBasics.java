package section12;

public class ArraysBasics {
    public static void main(String[] args) {
//        without arrays
        int mobileNumber1, mobileNumber2, mobileNumber3;

        int[] mobileNumbers = new int[3];
        double[] prices = new double[3];
        char[] characters = new char[3];
        String[] strings = new String[3];
        boolean[] booleans = new boolean[3];
        Person[] persons = new Person[3];

        int[] numbersWithValues = {1, 2, 3, 4, 5};

        mobileNumbers[0] = 1234567890;
        mobileNumbers[1] = 1234567891;
        mobileNumbers[2] = 1234567892;

//        mobileNumbers[4] = 1234567894; // ArrayIndexOutOfBoundsException
        int length = 10;

        String[] names = new String[length];

    }
}
