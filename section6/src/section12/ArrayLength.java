package section12;

public class ArrayLength {

    public static void main(String[] args) {
        int[] nums = {
                1, 2, 3, 4, 5
        };
        String[] names = new String[]{
                "John", "Doe", "Jane"
        };

        int[] mobileNumbers = new int[116];

        System.out.println("Length of nums: " + nums.length);
        System.out.println("Length of names: " + names.length);
        System.out.println("Length of mobileNumbers: " + mobileNumbers.length);


//        double[] prices = new double[Integer.MAX_VALUE]; // OutOfMemoryError

        int[] zeros = new int[0];
        System.out.println("Length of zeros: " + zeros.length);
        int[] ones = new int[0];
        System.out.println("Length of ones: " + ones.length);

    }


}
