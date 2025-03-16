package section6;

public class SpringPoolDemo {


    public static void main(String[] args) {
        String hello = "Hello Spring";
        String hello2 = "Hello Spring";
        String hello3 = "Hello Spring";

        SpringPoolDemo demo = new SpringPoolDemo();
        System.out.println(hello);
        System.out.println(hello2);
        System.out.println(hello3);
        System.out.println(hello == hello2);
        System.out.println(hello.hashCode());
        System.out.println(hello2.hashCode());
        System.out.println(hello3.hashCode());
        System.out.println("--------------------");
        String hello4 = new String("Hello Spring");
        System.out.println(hello4.hashCode());
        String hello5 = new String("Hello Spring");
        System.out.println(hello5.hashCode());

        System.out.println(hello4 == hello5);
    }
}
