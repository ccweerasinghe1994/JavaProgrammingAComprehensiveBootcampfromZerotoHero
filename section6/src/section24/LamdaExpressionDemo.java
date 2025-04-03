package section24;

public class LamdaExpressionDemo {
    public static void main(String[] args) {

        Hello hello = () -> {
            System.out.println("Hello World");
        };

        Hello hello2 = () -> System.out.println("Hello World 2");

        process(hello);
        process(hello2);

    }

    public static void process(Hello h) {
        h.sayHello();
    }
}
