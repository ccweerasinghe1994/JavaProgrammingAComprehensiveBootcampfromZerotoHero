package section28;

public class MainThread {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = Thread.currentThread();
        System.out.println("Thread name: " + thread.getName());
        System.out.println("Thread ID: " + thread.threadId());

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            System.out.println(String.format("Hello from %s thread id %s", thread.getName(), thread.threadId()));
            Thread.sleep(200);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Time taken: " + (endTime - startTime) / 1000 + " seconds");
    }
}
