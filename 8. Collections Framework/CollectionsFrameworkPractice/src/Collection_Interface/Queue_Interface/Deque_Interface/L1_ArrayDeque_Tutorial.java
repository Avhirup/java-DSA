package Collection_Interface.Queue_Interface.Deque_Interface;

import java.util.ArrayDeque;
import java.util.Deque;

public class L1_ArrayDeque_Tutorial {

    public static void main(String[] args) {
        // both of the implementations are correct (can use the Interface name or class name)
        // ArrayDeque<Integer> dq = new ArrayDeque<>();
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(10);
        dq.add(20);
        dq.add(50);     // default add() method insert element at the rare position
        System.out.println(dq);     // [10, 20, 50]

        dq.addFirst(100);
        System.out.println(dq);     // [100, 10, 20, 50]

        // remove element from first
        dq.pollFirst();

        // remove element from last
        dq.pollLast();

        System.out.println(dq);
    }
}
