package section8;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        String fruit = "orange";

        switch (fruit) {
            case "banana":
            case "apple":
                System.out.println("12 $ was charged");
                break;
            case "orange":
                System.out.println("10 $ was charged");
                break;
            case "grape":
                System.out.println("15 $ was charged");
                break;
            case "pineapple":
                System.out.println("20 $ was charged");
            default:
                System.out.println("Pick A valid fruit");
                break;
        }
    }
}
