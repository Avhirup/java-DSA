import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Collections;

public class Reverse_The_Queue {
    static void reverseQueue(Queue<Integer> sq) {
        if(sq.isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        ArrayList<Integer> arr = new ArrayList<>(sq.size());
        while(!sq.isEmpty()) {
            arr.add(sq.remove());
        }
        // either reverse the ArrayList and put the elements from index 0
//        Collections.reverse(arr);
//        for(int i=0 ; i<arr.size() ; i++) {
//            sq.add(arr.get(i));
//        }

        // or start from ending index of the ArrayList (withour reverseing)
        for(int i=arr.size()-1 ; i>-1 ; i--) {
            sq.add(arr.get(i));
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(40);
        q.add(5);
        System.out.println("Queue before reverseing: " + q);
        reverseQueue(q);
        System.out.println("Queue after reverseing:  " + q);
    }
}
