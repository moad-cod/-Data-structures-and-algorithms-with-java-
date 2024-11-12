// Priority Queue = FIFO data struture that serves elements
//                  With Highest priorities first
//                  Before elements with lower priorities

import java.util.Queue;
import java.util.Collections;
import java.util.PriorityQueue;

public class ThePriorityQueue {
    public static void main(String[] args) {
        // ==> Priority queue for doubles
        // Queue<Double> priorityQueueA = new PriorityQueue<>(); //Ascending
        // (or min-heap)
        Queue<Double> priorityQueueA = new PriorityQueue<>(Collections.reverseOrder()); // This method is used to change
        // the natural ordering of
        // elements in a PriorityQueue to
        // descending (or max-heap)
        priorityQueueA.offer(3.40);
        priorityQueueA.offer(4.00);
        priorityQueueA.offer(2.07);
        priorityQueueA.offer(1.00);
        priorityQueueA.offer(2.00);

        while (!priorityQueueA.isEmpty()) {
            System.out.println(priorityQueueA.poll());
        }
        // ==> Priority queue for strings
        Queue<String> priorityQueueB = new PriorityQueue<>();
        priorityQueueB.offer("C");
        priorityQueueB.offer("A");
        priorityQueueB.offer("R");
        priorityQueueB.offer("R");
        priorityQueueB.offer("F");

        while (!priorityQueueB.isEmpty()) {
            System.out.println(priorityQueueB.poll());
        }
    }
}
