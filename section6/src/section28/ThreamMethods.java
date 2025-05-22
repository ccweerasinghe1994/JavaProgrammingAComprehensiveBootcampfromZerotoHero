package section28;

public class ThreamMethods {
    public static void main(String[] args) {
        Thread thread1 = new Thread();
        Thread thread2 = new Thread();
        Thread thread3 = new Thread();

        thread3.setName("Thread 3");

        System.out.printf("Thread %s name: %s \n", thread1.getId(), thread1.getName());
        System.out.printf("Thread %s name: %s \n", thread2.threadId(), thread2.getName());
        System.out.printf("Thread %s name: %s \n", thread3.threadId(), thread3.getName());
    }
}
