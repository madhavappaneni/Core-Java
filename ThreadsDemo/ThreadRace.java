package ThreadsDemo;

class TestThreadIncrement {
    int i;

    public void increment() {
        i++;
    }

    public int get() {
        return i;
    }
}

public class ThreadRace {

    public static void main(String[] args) throws InterruptedException {
        TestThreadIncrement t = new TestThreadIncrement();
        Runnable a = () -> {
            for (int i = 0; i < 1000; i++) {
                t.increment();
            }
        };
        Runnable b = () -> {
            for (int i = 0; i < 1000; i++) {
                t.increment();
            }
        };

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(t.get());
    }
}
