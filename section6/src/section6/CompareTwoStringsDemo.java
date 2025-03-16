package section6;

public class CompareTwoStringsDemo {

    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("ABC");
        String s3 = new String("abc");

        boolean equals = s1.equals(s2);
        boolean equals1 = s1.equals(s3);
        boolean equals2 = "abc".equals(s1);
        boolean equalsIgnoreCase = s2.equalsIgnoreCase("ABC");

    }
}
