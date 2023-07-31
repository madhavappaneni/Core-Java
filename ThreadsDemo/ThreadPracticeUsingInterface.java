package ThreadsDemo;

class Hi2 implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Hello2 implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}

public class ThreadPracticeUsingInterface {
    public static void main(String[] args) {
        Hi2 obj1 = new Hi2();
        Hello2 obj2 = new Hello2();

        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj2);

        thread1.start();
        thread2.start();
    }
}
