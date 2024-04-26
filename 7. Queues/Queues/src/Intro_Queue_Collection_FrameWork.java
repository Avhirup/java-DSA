import java.sql.SQLOutput;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Intro_Queue_Collection_FrameWork {
    public static void main(String[] args) {
        // we can implement a Queue with the help of ArrayDeque which is an Interface
        Queue<Integer> q = new ArrayDeque<>();

        // or we can implement a Queue with the help of a LinkedList
        Queue<Integer> q1 = new LinkedList<>();

        // QUEUE OPERATIONS

        // isEmpty: CHECKING THE QUEUE IS EMPTY OF NOT (RETURNS A BOOLEAN)
        System.out.println(q.isEmpty());   // true

        // ADD ELEMENT TO THE QUEUE (adding from rear)
        // RETURNS BOOLEAN 'TRUE' WHEN SUCCESSFULLY GETS ADDED
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.add(4));       // true
        System.out.println(q.add(5));       // true
        // PRINTING THE FULL QUEUE
        System.out.println(q);              // [1, 2, 3, 4, 5]

        // REMOVING ELEMENT FROM THE QUEUE (remove is done at the front)
        // RETURNS THE POPPED ELEMENT FROM THE QUEUE
        System.out.println(q.remove());     // 1
        // we can do it by either way
        System.out.println(q.poll());       // 2
        System.out.println(q.remove());     // 3

        // RETURNS THE SIZE OF THE QUEUE
        System.out.println(q.size());       // 2

        // PRINTING THE FULL QUEUE
        System.out.println(q);              // [4, 5]

        // GETTING THE FRONT ELEMENT OF THE QUEUE
        System.out.println(q.peek());       // 4
        // we can do it by either way
        System.out.println(q.element());    // 4

    }
}
