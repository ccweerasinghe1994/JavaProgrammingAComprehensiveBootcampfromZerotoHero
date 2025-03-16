package section8;

public class BreakStatementDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        int[] numbers = {12, 43, 22, 66, 73};
        boolean numberFound = false;
        int targetNumber = 22;
        for (int i = 0; i < numbers.length; i++) {
            if (targetNumber == numbers[i]) {
                numberFound = true;
                break;
            }
        }

        if (numberFound) {
            System.out.println("Number found");
        } else {
            System.out.println("Number not found");
        }

        outerLoop:
        for (int i = 0; i < 10; i++) {
            innerLoop:
            for (int j = 0; j < 5; j++) {
                System.out.println("i: " + i + ", j: " + j);
                if (i == 1 && j == 3) {
                    break outerLoop;
                }
            }
        }
    }
}
