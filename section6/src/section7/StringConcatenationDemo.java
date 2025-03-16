package section7;

public class StringConcatenationDemo {
    public static void main(String[] args) {
//        + is left associative
//        left to right 2 + 4 + "goals" -> 6 + "goals" -> 6goals
        String output = 2 + 4 + "goals"; // 6goals

//        + is left associative but () has higher precedence
//        left to right 2 + (4 + "goals") -> 2 + 4goals -> 24goals
        String output2 = 2 + (4 + "goals"); // 24goals
        String output3 = "" + 2 + 4 + "goals"; // 24goals
        String output4 = false + (2 + 4 + "goals"); // false24goals

        String nullValue = null;
        String nullValueAddition = 6 + nullValue; // 6null


    }
}
