package test01;

public class DSA03 {
    public static void main(String[] args) {
        int[] array = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int i = longestCommonPrefix(array);
        System.out.println(i);
    }

    public static int longestCommonPrefix(int[] array) {
        int max = array[0];
        int currentSum = 0;

        for (int i : array) {
//            if the current sum value has a negative prefix we reset the sum to zero
            if (currentSum < 0) {
                currentSum = 0;
            }
            currentSum += i;
            max = Math.max(currentSum, max);
        }

        return max;
    }
}
