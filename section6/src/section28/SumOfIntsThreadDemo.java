package section28;

public class SumOfIntsThreadDemo {
    public static void main(String[] args) {
        SomeThread thread = new SomeThread(0, Integer.MAX_VALUE / 10);
        SomeThread thread1 = new SomeThread((Integer.MAX_VALUE / 10) + 1, (Integer.MAX_VALUE / 10) * 2);
        SomeThread thread2 = new SomeThread((Integer.MAX_VALUE / 10) * 2 + 1, (Integer.MAX_VALUE / 10) * 3);
        SomeThread thread3 = new SomeThread((Integer.MAX_VALUE / 10) * 3 + 1, (Integer.MAX_VALUE / 10) * 4);
        SomeThread thread4 = new SomeThread((Integer.MAX_VALUE / 10) * 4 + 1, (Integer.MAX_VALUE / 10) * 5);
        SomeThread thread5 = new SomeThread((Integer.MAX_VALUE / 10) * 5 + 1, (Integer.MAX_VALUE / 10) * 6);
        SomeThread thread6 = new SomeThread((Integer.MAX_VALUE / 10) * 6 + 1, (Integer.MAX_VALUE / 10) * 7);
        SomeThread thread7 = new SomeThread((Integer.MAX_VALUE / 10) * 7 + 1, (Integer.MAX_VALUE / 10) * 8);
        SomeThread thread8 = new SomeThread((Integer.MAX_VALUE / 10) * 8 + 1, (Integer.MAX_VALUE / 10) * 9);
        SomeThread thread9 = new SomeThread((Integer.MAX_VALUE / 10) * 9 + 1, Integer.MAX_VALUE);


        long startTime = System.currentTimeMillis();
        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();

        try {
            thread.join();
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
            thread6.join();
            thread7.join();
            thread8.join();
            thread9.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long sum = thread.getSum() + thread1.getSum() + thread2.getSum() + thread3.getSum() + thread4.getSum() + thread5.getSum() + thread6.getSum() + thread7.getSum() + thread8.getSum() + thread9.getSum();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");
        System.out.println("Sum of integers from 0 to " + Integer.MAX_VALUE + " is: " + sum);
    }
}
