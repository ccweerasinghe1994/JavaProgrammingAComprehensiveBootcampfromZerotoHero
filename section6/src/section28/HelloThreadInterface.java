package section28;

public class HelloThreadInterface implements Runnable {
    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        System.out.println("Hello from thread which implements Runnable interface");
    }
}
