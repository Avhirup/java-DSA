import java.util.LinkedList;
import java.util.Queue;

public class Display_Queue_Manually {
    static void displayQueue(Queue<Integer> sq) {
        // CREATING NEW QUEUE TO ADD ALL THE ELEMENTS OF THE ORIGINAL QUEUE
        Queue<Integer> supportQ = new LinkedList<>();
        while(!sq.isEmpty()) {
            int elem = sq.remove();
            System.out.print(elem + " ");
            supportQ.add(elem);
        }
        System.out.println();

        // AFTER PRINTING ADDING ALL THE ELEMENTS FROM supportQ TO ORIGINAL QUEUE (q)
        // THIS IS A METHOD, USING WHICH WE CAN COPY ALL THE ELEMENTS OF ONE QUEUE INTO ANOTHER
//        sq.addAll(supportQ);

        // copying manually
        while(!supportQ.isEmpty()) {
            sq.add(supportQ.remove());
        }
    }


    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        displayQueue(q);
        System.out.println(q);
    }
}
