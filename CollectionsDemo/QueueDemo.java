package CollectionsDemo;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();

        queue.add("c");
        queue.add("a");
        queue.add("b");
        queue.offer("d");

        System.out.println(queue);
        System.out.println("Front: " + queue.peek());
        // Peek returns null when the queue is empty
        System.out.println("Front: " + queue.element());
        // Element throws exception when the queue is empty
        System.out.println("Front: " + queue.remove());
        System.out.println(queue);

    }
}
