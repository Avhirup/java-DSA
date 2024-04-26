public class CircularLinkedList_Doubly {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val) {
            this.val = val;
        }
    }

    public static class CirculatDoublyList {
        Node head = null;
        Node tail = null;

        void displayList() {
            if(head == null) {
                System.out.println("List is empty.");
                return;
            }
            Node temp = head;
            System.out.print(temp.val + " ");
            temp = temp.next;
            while(temp!=head) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CirculatDoublyList l1 = new CirculatDoublyList();
        l1.displayList();
    }
}
