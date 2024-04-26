import java.util.ArrayDeque;
import java.util.Deque;

public class Doubly_Ended_Queue {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        // ADDING ELEMENTS INTO DQUE
        dq.addLast(10);
        dq.addLast(20);
        dq.addLast(30);
        dq.addLast(40);
        dq.addFirst(100);
        dq.add(1000);   // ADDS FROM THE LAST
        System.out.println(dq);

        // REMOVING ELEMENTS FROM DQUE
        System.out.println(dq.removeFirst());
        System.out.println(dq.removeLast());
        dq.remove();   // REMOVES FROM THE LAST
        // dq.retainAll(dq); // REMOVES ALL ELEMENTS FROM THE DQUE

        // PEEK FUNCTION IS NAMED DIFFERENTLY HERE
//        System.out.println(dq.getFirst());
//        System.out.println(dq.getLast());


        dq.addFirst(30);
        dq.addFirst(50);
        dq.addFirst(30);

        System.out.println(dq);     // CURRENTLY DEQUE IS : [30, 50, 30, 20, 30, 40]

        // REMOVING FIRST OCCURRENCE OF 30
        dq.removeFirstOccurrence(30);
        System.out.println(dq);

        // REMOVING LAST OCCURRENCE OF 30
        dq.removeLastOccurrence(30);

        System.out.println(dq);
    }
}
