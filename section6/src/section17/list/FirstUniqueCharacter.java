package section17.list;

public class FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    // Optional main method to test the function
    public static void main(String[] args) {
        String s1 = "leetcode";
        String s2 = "loveleetcode";
        String s3 = "aabb";

        System.out.println(firstUniqChar(s1)); // Expected output: 0
        System.out.println(firstUniqChar(s2)); // Expected output: 2
        System.out.println(firstUniqChar(s3)); // Expected output: -1
    }
}
