package section28;

public class SomeThread extends Thread {

    private final long startIndex;
    private final long endIndex;
    private long sum = 0;

    public SomeThread(long startIndex, long endIndex) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run() {
        for (long i = startIndex; i < endIndex; i++) {
            sum += i;
        }

    }

    public long getSum() {
        return sum;
    }
}
