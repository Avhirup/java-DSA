public class DLL_Intro {
    public static class DLNode {
        DLNode prev;
        int val;
        DLNode next;
        DLNode(int val) {
            this.val = val;
        }
    }

    public static void displayList(DLNode head) {
        DLNode temp = head;
        while(temp!=null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void displayListReverse(DLNode tail) {
        DLNode temp = tail;
        while(temp!=null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // SIMPLE IMPLEMENTATION OF A DOUBLY LINKED LIST

        DLNode a = new DLNode(5);
        DLNode b = new DLNode(15);
        DLNode c = new DLNode(25);
        DLNode d = new DLNode(35);
        DLNode e = new DLNode(45);
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;
        System.out.print("Printing the LinkedList: ");
        displayList(a);
        System.out.print("Printing the LinkedList in Reverse Order: ");
        displayListReverse(e);
    }
}
