public class Queue_Implementation_Using_LinkedList {
    public static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }

    public static class queue {
        Node head;
        Node tail;
        private int size = 0;
        void add(int element) {
            Node nn = new Node(element);
            size++;
            if(head == null) {
                head = tail = nn;
                return;
            }
            tail.next = nn;
            tail = nn;
        }

        int remove() {
            if(head == null) {
                System.out.print("\nQueue is empty ");
                return Integer.MIN_VALUE;
            }
            int element = head.val;
            head = head.next;
            size--;
            return element;
        }

        int peek() {
            if(head == null) {
                System.out.print("Queue is empty ");
                return Integer.MIN_VALUE;
            }
            return head.val;
        }

        void display() {
            Node temp = head;
            System.out.print("[ ");
            while(temp!=null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.print("]");
        }

        boolean isEmpty() {
            if(size == 0)
                return true;
            return false;
        }
        int size() {
            return size;
        }
    }

    public static void main(String[] args) {
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        q.remove();
        q.remove();
        q.add(100);
        q.add(200);
//        System.out.println("\nRemoved element: " + q.remove());
//        System.out.println("Size of Queue: " + q.size());
//        System.out.print("Displaying the Queue: ");
        q.display();
    }
}
