package section6;

public class PrintfMethodDemo {
    public static void main(String[] args) {
        String normalWay = "this is a formatted string %s %d %b %c %.2f%n";
        String formatted = String.format(normalWay, "abc", 12, false, 'A', 45.55);
        System.out.println(formatted);
        System.out.printf(normalWay, "abc", 12, false, 'A', 45.55);
        System.out.println("another string");
    }
}
