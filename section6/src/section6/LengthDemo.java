package section6;

public class LengthDemo {
    public static void main(String[] args) {
        String s1 = "abc";
        int length = s1.length();
        System.out.println(length);
        String s2 = "abc" + " " + s1;
        int s2Length = s2.length();
        System.out.println(s2Length);

        int inlineLength = "".length();
        int inlineLength2 = "aaaa".length();
        System.out.println(inlineLength);
        System.out.println(inlineLength2);
    }
}
