package ThreadsDemo;

public class ThreadPrac2 {
    public static void main(String[] args) {
        // A10 a = new A10();
        // B10 b = new B10();

        Runnable a = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable b = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();
    }
}
