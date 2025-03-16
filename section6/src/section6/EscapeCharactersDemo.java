package section6;

public class EscapeCharactersDemo {

    public static void main(String[] args) {
        String escapeString = "\"chamara\"";
        System.out.println(escapeString);


        String unicodeExample = "\u004D";
        System.out.println(unicodeExample);
        String unicodeExampleWithString = "\u004DChamara\u0021";
        System.out.println(unicodeExampleWithString);
    }
}
