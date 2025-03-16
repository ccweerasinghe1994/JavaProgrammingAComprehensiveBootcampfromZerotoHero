package section16;

public class AutoBoxingAndUnboxing {
    public static void main(String[] args) {

        long sum = 0L; // Wrapper type
        long startTime = System.nanoTime();
        for (long i = 0; i < 1_000_000_000; i++) {
            sum += i; // Autoboxing happens here repeatedly
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Sum: " + sum);
        System.out.println("Execution time in seconds: " + duration / 1_000_000_000.0);
    }
}

// 2.9009091
// 0.3550036