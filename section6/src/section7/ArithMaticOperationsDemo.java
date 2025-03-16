package section7;

public class ArithMaticOperationsDemo {

    public static void main(String[] args) {
        double num1;
        double num2 = 23.5;
        byte num3 = 12;
//      this is ok, because num2 is double and num3 is byte, so num3 is promoted to double
        num1 = num2 + num3;
//        order does not matter
        num1 = num3 + num2;
//        this is not ok, because num2 is double and num3 is byte, so num3 is promoted to double
//        and the result is double, but we are trying to store it in a int variable
//        int num4 = num3 + num2;

//      this is ok, because 12 and 23 are literals, so jvm can compile time evaluate the result
//        and the result is 35, which is between -128 and 127, so it can be stored in a byte variable
//        but when we pass variables, jvm does not know the value of the variables at compile time
//        so, it does not know if the result is between -128 and 127
        byte x = 12 + 23;


    }
}
