package section28;

public class SumOfIntDemo {

    public static void main(String[] args) {
        long sum = 0;
        long startTime = System.currentTimeMillis();
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Sum of integers from 0 to " + Integer.MAX_VALUE + " is: " + sum);
        System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");
    }
}
//Time taken: 577 milliseconds