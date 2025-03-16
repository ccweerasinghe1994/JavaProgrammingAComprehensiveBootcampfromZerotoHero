package section17.list;

public class Palindram {
    public static void main(String[] args) {
        boolean aba = isPalindram("aba1");
        System.out.println(aba);
    }

    public static boolean isPalindram(String word) {
        StringBuilder stringBuffer = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            stringBuffer.append(word.charAt(i));
        }

        String reversed = stringBuffer.toString();


        return reversed.equals(word);
    }
}
