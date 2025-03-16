package test01;

import java.util.Arrays;

public class DSA01 {
    public static void main(String[] args) {
        System.out.println(isAnagram("abafdf", "fdfaba"));
    }

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] charsS = s.toCharArray();
        Arrays.sort(charsS);
        String sortedS = new String(charsS);

        char[] charsT = t.toCharArray();
        Arrays.sort(charsT);
        String sortedT = new String(charsT);

        return sortedS.equals(sortedT);

    }
}
