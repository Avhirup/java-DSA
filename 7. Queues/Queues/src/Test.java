import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        // Create the source Queue and add elements
//        Queue<Integer> sourceQueue = new ArrayDeque<>();
        Queue<Integer> sourceQueue = new LinkedList<>();
        sourceQueue.add(1);
        sourceQueue.add(2);
        sourceQueue.add(3);
        sourceQueue.add(4);
        sourceQueue.add(5);

        // Create the destination Queue
//        Queue<Integer> destinationQueue = new ArrayDeque<>();
        Queue<Integer> destinationQueue = new LinkedList<>();

        // Copy elements from the source Queue to the destination Queue
        destinationQueue.addAll(sourceQueue);

        // Print the destination Queue to verify the copy
        System.out.println("Destination Queue: " + destinationQueue);
    }
}
