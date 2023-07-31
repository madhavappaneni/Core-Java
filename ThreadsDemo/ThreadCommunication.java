package ThreadsDemo;

class A {

}

class Q {
    int num;

    public void put(int num) {
        this.num = num;
        System.out.println("Put: " + this.num);
    }

    public void get() {
        System.out.println("Get: " + this.num);
    }
}

class Producer implements Runnable {
    Q q;

    public Producer(Q q) {
        this.q = q;
        Thread thread = new Thread(this, "Producer");
        thread.start();
    }

    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }
}

class Consumer implements Runnable {
    Q q;

    public Consumer(Q q) {
        this.q = q;
        Thread thread = new Thread(this, "Consumer");
        thread.start();
    }

    public void run() {
        while (true) {
            q.get();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

public class ThreadCommunication {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
}