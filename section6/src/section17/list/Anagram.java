package section17.list;

public class Anagram {
    // Optional main method to test
    public static void main(String[] args) {
        String s1 = "an @  121212 agram", t1 = "    nagaram";
        String s2 = "rat", t2 = "car";

        System.out.println(isAnagram(s1, t1)); // true
        System.out.println(isAnagram(s2, t2)); // false
    }

    public static boolean isAnagram(String word1, String word2) {

//        String lowercasedWord1 = word1.replaceAll("\\s+", "").toLowerCase();
//        String lowercasedWord2 = word2.replaceAll("\\s+", "").toLowerCase();

        String lowercasedWord1 = word1.replaceAll("\\s+", "").replaceAll("[^a-zA-Z]", "").toLowerCase();
        String lowercasedWord2 = word2.replaceAll("\\s+", "").replaceAll("[^a-zA-Z]", "").toLowerCase();
        if (lowercasedWord1.length() != lowercasedWord2.length()) {
            return false;
        }

        int[] frequesncy = new int[26];

        for (int i = 0; i < lowercasedWord1.length(); i++) {
            frequesncy[lowercasedWord1.charAt(i) - 'a']++;
            frequesncy[lowercasedWord2.charAt(i) - 'a']--;
        }

        for (int i : frequesncy) {
            if (i != 0) {
                return false;
            }
        }

        return true;

    }
}
