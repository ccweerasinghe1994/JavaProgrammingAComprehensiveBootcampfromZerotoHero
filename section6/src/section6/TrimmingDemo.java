package section6;

public class TrimmingDemo {
    public static void main(String[] args) {
        String trim = "     java".trim();
        String trim1 = "java               ".trim();
        String trim2 = "\n \r\t java".trim();
        String trim3 = "java \n \r".trim();
        " java \n \r abc  ".trim();
    }
}
