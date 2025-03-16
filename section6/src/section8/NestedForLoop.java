package section8;

public class NestedForLoop {
    public static void main(String[] args) {
        int number = 10;
//        for (int i = 0; i <= number; i++) {
//            for (int j = 0; j < number; j++) {
//                System.out.println(i + " x " + j + " = " + i * j);
//            }
//        }
        int rows = 15;
        String stars = "";
        for (int i = 0; i <= rows; i++) {
            stars += "*";
            System.out.println(stars);
        }
    }
}
