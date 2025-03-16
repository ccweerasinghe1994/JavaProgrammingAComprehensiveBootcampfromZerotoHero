package section8;

public class NotOperatorExample {
    public static void main(String[] args) {
        int i = 0;
        checkValueIsZero(i);

    }

    public static void checkValueIsZero(int number) {
        if (!(number == 0)) {
            System.out.println("i is not equal to 0");
        } else {
            System.out.println("i is equal to 0");
        }
    }
}
