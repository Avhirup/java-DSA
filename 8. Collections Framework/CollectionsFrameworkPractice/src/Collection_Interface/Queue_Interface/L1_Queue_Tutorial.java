package Collection_Interface.Queue_Interface;

import java.util.ArrayDeque;
import java.util.Queue;

public class L1_Queue_Tutorial {
    public static void main(String[] args) {
//        Queue<Integer> q = new LinkedList<>();
//        LinkedList<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);

        System.out.println(q);
    }
}
