package section8;

public class SwitchExpressionDemo {
    public static void main(String[] args) {
        String fruit = "apple";

        switch (fruit) {
            case "banana", "apple" -> System.out.println("12 $ was charged");

            case "orange" -> System.out.println("10 $ was charged");

            case "grape" -> System.out.println("15 $ was charged");

            default -> System.out.println("Invalid fruit");
        }

        String fruit1 = "orange";

        int price = switch (fruit1) {
            case "banana", "apple" -> 12;
            case "orange" -> 10;
            case "grape" -> 15;
            default -> throw new IllegalStateException("Unexpected value: " + fruit1);
        };

        int price1 = switch (fruit1) {
            case "banana", "apple" -> {
                System.out.println("12 $ was charged");
                yield 12;
            }
            case "orange" -> {
                System.out.println("10 $ was charged");
                yield 10;
            }
            case "grape" -> {
                System.out.println("15 $ was charged");
                yield 15;
            }
            default -> throw new IllegalStateException("Unexpected value: " + fruit1);
        };
    }
}
