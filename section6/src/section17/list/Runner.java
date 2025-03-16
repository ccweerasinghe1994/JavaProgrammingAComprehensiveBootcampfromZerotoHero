package section17.list;

public class Runner {


    public static void main(String[] args) {
        String s1 = "aba", t1 = "aba";
        String s2 = "rat", t2 = "car";
        System.out.println(isAnagram(s1, t1)); // true
    }

    public static boolean isAnagram(String word1, String word2) {

        int[] frequency = new int[26];
        if (word1.length() != word2.length()) {
            return false;
        }
        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();

        for (int i = 0; i < charArray1.length; i++) {
            frequency[charArray1[i] - 'a']++;
            frequency[charArray2[i] - 'a']--;
        }

        for (int i : frequency) {
            if (i != 0) {
                return false;
            }
        }
        return true;

    }
}
