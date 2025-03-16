package section6;

public class ConcatMethodDemo {
    public static void main(String[] args) {
        String s1 = "hello";
        s1 = s1 + " " + "world";
        System.out.println(s1);

        String s2 = "hello".concat(" ").concat("world");
        System.out.println(s2);

        String emptyString = "";
        String nullString = null;
        System.out.println(emptyString.hashCode());
//        you cant call this
//        Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.hashCode()" because "nullString" is null
//	at ConcatMethodDemo.main(ConcatMethodDemo.java:13)
        System.out.println(nullString.hashCode());
    }
}
