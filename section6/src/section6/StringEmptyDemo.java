package section6;

public class StringEmptyDemo {
    public static void main(String[] args) {
        String empty = " ";

        boolean usingIsEmpty = empty.isEmpty();
        boolean usingLength = empty.length() == 0;
        boolean nullSafeWay = "".equals(empty);
//         this ignores white spaces
        boolean usingIsBlank = empty.isBlank();
    }
}
