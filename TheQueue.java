// Queue = FIFO data structure. First-In First-Out
//         A collection designed for holding elemnets priot to processing
//         Linear data structure

//         Add = enqueue, offer()
//         Remove = dequeue, poll()

import java.util.LinkedList;
import java.util.Queue;

public class TheQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        // Append to the queue
        queue.offer("Microsoft");
        queue.offer("Amazon");
        queue.offer("Tesla");
        queue.offer("IBM");
        // remove the first input
        System.out.println(queue.poll()); // ==> Microsoft
        // output the last input
        System.out.println(queue.element()); // ==> Microsoft
        // check if the queue is Empty or not (False, True)
        System.out.println(queue.isEmpty());
        // Output the size of the queue
        System.out.println(queue.size());
        // Boolean search 1 if the object in the queue and -1 if not
        System.out.println(queue.contains("IBM")); // ==> True
        System.out.println(queue);
    }
}