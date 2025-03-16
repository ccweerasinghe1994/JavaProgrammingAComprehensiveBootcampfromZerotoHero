import java.util.Arrays;

public class DsaPrep {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 11, 32, 1111, 3};
        int theMaximum = findTheMaximum2(nums);
        System.out.println(theMaximum);
    }

    public static int findTheMaximum(int[] array) {
        int max = 0;

        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int findTheMaximum2(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }
}
