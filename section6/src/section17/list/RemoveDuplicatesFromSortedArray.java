package section17.list;

public class RemoveDuplicatesFromSortedArray {


    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[uniqueIndex] != nums[i]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }

        return uniqueIndex + 1;
    }


    // Optional main method to test
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int length = removeDuplicates(nums);
        System.out.println("New length: " + length);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
