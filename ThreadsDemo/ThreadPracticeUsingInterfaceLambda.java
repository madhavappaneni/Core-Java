package ThreadsDemo;

public class ThreadPracticeUsingInterfaceLambda {

    public static void main(String[] args) throws Exception {

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }, "Hi Thread");
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }, "Hello Thread");

        System.out.println("Thread Name: " + thread1.getName());
        System.out.println("Thread Name: " + thread2.getName());
        thread1.setName("Hi Thread");
        thread2.setName("Hello Thread");
        System.out.println("Thread Name: " + thread1.getName());
        System.out.println("Thread Name: " + thread2.getName());

        System.out.println("Thread priority: " + thread1.getPriority());
        System.out.println("Thread priority: " + thread2.getPriority());
        thread1.setPriority(10);
        thread2.setPriority(1);
        // Alternatively
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        // try {
        // Thread.sleep(10000);
        // } catch (Exception e) {
        // }
        thread2.start();
        System.out.println("Test Bye 1");
        System.out.println(thread1.isAlive());
        thread1.join();
        thread2.join(); // main thread waits till thread1 and thread2 are finished

        System.out.println(thread1.isAlive());
        System.out.println("Test Bye 2");
    }
}
