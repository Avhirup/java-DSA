package Collection_Interface.Queue_Interface;

import java.util.Comparator;
import java.util.PriorityQueue;

public class L2_Priority_Queue_Tutorial {
    public static void main(String[] args) {
        // By-default PriorityQueue is created as a MIN PriorityQueue.
        // Smallest element will automatically come at the front
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(10);
        pq.offer(15);
        pq.offer(5);
        System.out.println(pq);     // [5, 15, 10]
        /*
        NOTE: only the smallest element will be at the front, this is confirmed, but after that
        the positions of the elements are fully random, no any pattern follows
         */

        // (Smallest element has the highest priority)
        System.out.println(pq.peek());  // 5

        System.out.println(pq.poll());  // 5
        System.out.println(pq.poll());  // 10

        // MAKING MAX PRIORITY QUEUE using CUSTOM Comparator
        PriorityQueue<Integer> p1 = new PriorityQueue<>(Comparator.reverseOrder());     // Max PriorityQueue

    }
}
