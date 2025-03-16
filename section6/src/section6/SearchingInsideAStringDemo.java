package section6;

public class SearchingInsideAStringDemo {
    public static void main(String[] args) {
        String stringToSearch = "Hello World!";

        int e = stringToSearch.indexOf('e');
        int world = stringToSearch.indexOf("World");
        int invalid = stringToSearch.indexOf("World@");
        boolean invalid2 = stringToSearch.startsWith("World@");
        boolean invalid3 = stringToSearch.startsWith("H");

        boolean world1 = stringToSearch.contains("World");
        boolean invalidString = stringToSearch.contains("Worsdsadld");

        boolean matches = stringToSearch.matches(".*w.*");
        boolean matches2 = stringToSearch.matches(".*W.*");
    }
}
