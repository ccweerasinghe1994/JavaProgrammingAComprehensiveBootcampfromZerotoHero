package section7;

public class CompoundArithmaticAsignmentOperator {
    public static void main(String[] args) {
        int num1 = 100;
        num1 += 10.3;
        System.out.println("num1 = " + num1); // 110

        int num2 = 100;
        num2 -= 10.3;
        System.out.println("num2 = " + num2); // 89

        String str1 = "Hello";
        str1 += 2;
        System.out.println("str1 = " + str1); // Hello2
    }
}
