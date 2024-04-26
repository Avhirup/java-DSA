package Linked_List;

public class linked_list_simple_intro {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }

        // METHOD TO FIND LENGTH OF THE LINKED LIST FROM THE STARTING NODE
        public int length() {
            int count=0;
            Node temp = this;
            while(temp!=null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    public static void printLinkedList(Node head) {
        System.out.println("Linked List: ");

        // HERE WE ARE NOT CREATING A NEW NODE, SO NO NEW SPACE WILL BE OCCUPIED IN HEAP MEMORY
        // TO CREATE A NEW NODE WE NEED TO USE 'new' KEYWORD
        // HERE WE ARE JUST POINTING 'currNode' TO THE SAME LOCATION WHERE 'head' NODE IS POINTING
        // 'currNode' IS NOTHING BUT A 'Node' TYPE VARIABLE
        // WE CAN THINK OF THIS LIKE, IN STACK A VARIABLE NAMED 'currNode' is created
        Node currNode = head;

        while(currNode!=null) {
            if(currNode.next == null)
                System.out.println(currNode.data);
            else
                System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
    }

    public static void printLinkedListRecursive(Node temp) {
        if(temp == null)
            return;
        if(temp.next == null)
            System.out.println(temp.data);
        else
            System.out.print(temp.data + " -> ");
        printLinkedListRecursive(temp.next);
    }

    public static void printLinkedListInReverse(Node temp) {
        if(temp==null)
            return;
        printLinkedListInReverse(temp.next);
        System.out.print(temp.data + " ");
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        // PRINTING THE LINKED LIST
        printLinkedList(a);
        printLinkedListRecursive(a);
        printLinkedListInReverse(a);
    }
}
