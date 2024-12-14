public class MethodInvocationDemo {
    public static void main(String[] args) {
        MethodInvocationDemo demo = new MethodInvocationDemo();
        demo.method();
    }

    public void method() {
        int number = 1;
        System.out.println("Method 1!");
        String output = method2();
        System.out.println(output);
    }

    public String method2() {

        String output = "HELLO WORLD!";
        System.out.println("Method 2!");
        method3("Hi");
        return output;
    }

    public void method3(String input) {

        System.out.println(input);
        System.out.println("Method 3!");
        method4(10);
    }

    public void method4(int number) {
        System.out.println(number);
        System.out.println("Method 4!");
    }


}
