package section28;

public class Main {
    public static void main(String[] args) {
        HelloThread helloThread = new HelloThread();
        helloThread.start();

        HelloThreadInterface helloThreadInterface = new HelloThreadInterface();
        Thread thread = new Thread(helloThreadInterface);
        thread.start();

        Thread thread1 = new Thread(Hello::hello);
        thread1.start();
    }
}
