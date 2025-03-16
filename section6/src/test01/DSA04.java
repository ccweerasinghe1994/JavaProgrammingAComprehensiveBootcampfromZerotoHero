package test01;

public class DSA04 {
    public static void main(String[] args) {
        int[] sortedArray = new int[]{1, 3, 4, 5, 7, 10, 11};
        int target = 9;
        int[] targetArray = getTargetArray(sortedArray, target);
        System.out.println(targetArray);

    }

    private static int[] getTargetArray(int[] sortedArray, int target) {

        int left = 0;
        int right = sortedArray.length - 1;

//        left + right = target
//        right = target - left;
        while (left < right) {
            if (sortedArray[left] + sortedArray[right] == target) {
                return new int[]{left, right};
            }

            if (sortedArray[left] + sortedArray[right] > target) {
                right--;
            } else {
                left++;
            }


        }

        return new int[]{};
    }
}
