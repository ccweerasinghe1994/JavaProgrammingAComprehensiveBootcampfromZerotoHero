package section6;

public class InternMethodDemo {
    public static void main(String[] args) {
        String hello = "Hello";
        String stringPoll = new String("Hello").intern();
        System.out.println(stringPoll == hello);

        String s1 = "abc";
        String s2 = new String("abc");

        System.out.println(s1 == s2);

        String s3 = s2.intern();
        System.out.println(s1 == s3);


    }
}
