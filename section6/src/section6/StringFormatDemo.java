package section6;

public class StringFormatDemo {
    public static void main(String[] args) {
        String messages = "Hello %s you have %d messages";
        String name = "chamara";
        int numberOfMessages = 12;
        String format = String.format(messages, name, numberOfMessages);

        double price = 19.99;
        String formatted = String.format("this price is %f", price);
        String presisonChanged = String.format("this price is %.2f", price);

        int number = 43;
        String s = String.format("The number is %8d", number);
        System.out.println(s);

        String name1 = "John";
        int age = 25;
        String formatted1 = String.format("my name is %2$s, I am %1$d years old, and i Live in %3$s", age, name1, "Colombo");
        System.out.println(formatted1);

    }
}
