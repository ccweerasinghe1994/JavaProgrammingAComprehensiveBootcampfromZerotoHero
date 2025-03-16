package section17.list;

public class StrStrImplementation {
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;  // Per the problem statement
        }
        if (haystack.isEmpty()) {
            return -1; // If haystack is empty and needle isn't
        }

        int hLen = haystack.length();
        int nLen = needle.length();

        // Slide over haystack, checking if the substring matches 'needle'
        for (int i = 0; i <= hLen - nLen; i++) {
            if (haystack.substring(i, i + nLen).equals(needle)) {
                return i;
            }
        }
        return -1; // If no match is found
    }

    // Optional main method to test
    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));   // Expected output: 2
        System.out.println(strStr("aaaaa", "bba"));  // Expected output: -1
        System.out.println(strStr("", ""));          // Expected output: 0
    }
}
