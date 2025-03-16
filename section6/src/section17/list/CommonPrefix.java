package section17.list;

public class CommonPrefix {
    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};
        String[] strs3 = {"interview", "internet", "internal", "interval"};

        System.out.println(longestCommonPrefix(strs1)); // Expected: "fl"
        System.out.println(longestCommonPrefix(strs2)); // Expected: ""
        System.out.println(longestCommonPrefix(strs3)); // Expected: "inte"
    }


    public static String longestCommonPrefix(String[] words) {

        if (words == null || words.length == 0) {
            return "";
        }

        String prefix = words[0];

        for (String word : words) {
            while (word.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
