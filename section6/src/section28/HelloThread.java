package section28;

public class HelloThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello from thread which extends Thread class");
    }
}
