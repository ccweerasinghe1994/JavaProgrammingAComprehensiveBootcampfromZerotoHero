package test01;

import java.util.HashMap;

public class DSA02 {
    public static void main(String[] args) {
        int[] array = new int[]{2, 1, 5, 3};
        int target = 4;
        int[] result = targetSun(array, target);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] targetSun(int[] values, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < values.length; i++) {
            int complement = target - values[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(values[i], i);
        }
        return new int[]{};

    }
}
