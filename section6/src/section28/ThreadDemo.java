package section28;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread thread = new Thread();
//        threads are created in the heap memory
        thread.start();

        Thread thread1 = new Thread(() -> {
            System.out.println("Hello from thread 1");
        });
        thread1.start();

        Runnable runnable = () -> {
            System.out.println("Hello from thread 2");
        };

        Thread thread2 = new Thread(runnable);
        thread2.start();
        System.out.println("Hello from main thread");
    }
}
