package ThreadsDemo;

class Counter {
    private int count;

    public synchronized void increment() {
        count = count + 1;
    }

    public int getCount() {
        return count;
    }
}

public class ThreadSynchronization {
    public static void main(String[] args) throws Exception {

        Counter c = new Counter();

        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    c.increment();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    c.increment();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Count: " + c.getCount());

    }
}
