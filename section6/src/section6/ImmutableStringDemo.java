package section6;

public class ImmutableStringDemo {

    public static void main(String[] args) {
        String s1 = "hello";
        System.out.println(s1.hashCode());

        s1 = "new value";
        System.out.println(s1.hashCode());

    }
}
