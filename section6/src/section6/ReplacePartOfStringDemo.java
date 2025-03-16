package section6;

public class ReplacePartOfStringDemo {
    public static void main(String[] args) {
        String originalString = "This is a sample code";
        String replace = originalString.replace("sample", "production");

        String s = originalString.replaceAll("a|e|i|o|u", "*");

        String s1 = originalString.replaceFirst("a", "#####");

    }
}
