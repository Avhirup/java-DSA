public class DoublyLinkedList {
    public static class Node {
        Node prev;
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }

    public static class DoublyListNode {
        Node head = null;
        Node tail = null;
        int length = 0;

        // INSERT AT THE END
        public void insertAtEnd(int value) {
            Node temp = new Node(value);
            if(head == null) {
                head = tail = temp;
            }
            else {
                temp.prev = tail;
                tail.next = temp;
                tail = tail.next;
            }
            length++;
        }

        // INSERT AT THE BEGINNING
        public void insertAtBeginning(int value) {
            if(head == null){
                insertAtEnd(value);
                return;
            }
            Node temp = new Node(value);
            head.prev = temp;
            temp.next = head;
            head = temp;
            length++;
        }

//         INSERT AT A GIVEN INDEX
        public void insertAt(int index, int value) {
            if(index < 0 || index > length) {
                System.out.println(index + " : Index is out of bound");
                return;
            }
            if(index == 0) {
                insertAtBeginning(value);
            }
            else if(index == length) {
                insertAtEnd(value);
            }
            else {
                Node temp = head;
                Node nn = new Node(value);
                for(int i=0 ; i < this.length ; i++) {
                    if(i==index) {
                        nn.next = temp;
                        nn.prev = temp.prev;
                        temp.prev.next = nn;
                        temp.prev = nn;
                        length++;
                        return;
                    }
                    temp = temp.next;
                }
            }
        }

//         DELETE FROM BEGINNING
        public void deleteFromBeginning() {
            if(head == null) {
                System.out.println("List is already empty.");
            } else if (head!=null && head == tail) {
                head = tail = null;
                System.out.println("The list is become empty now.");
            }
            else {
                head = head.next;
                head.prev = null;
            }
            length--;
        }

//         DELETE FROM BEGINNING
        public void deleteFromEnd() {
            if(head == null) {
                System.out.println("List is already empty.");
                return;
            } else if (head!=null && head == tail) {
                head = tail = null;
                System.out.println("The list is become empty now.");
                return;
            }
            else {
                tail = tail.prev;
                tail.next = null;
            }
            length--;
        }

//      DELETE ELEMENT FROM GIVEN INDEX
        public void deleteAt(int index) {
            if(index >= this.length) {
                System.out.println("Index out of bound.");
                return;
            } else if (head == null) {
                System.out.println("List is already empty.");
                return;
            }
            else {
                Node temp = head;
                for(int i=0 ; i<index ; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                temp.next.prev = temp;
            }
            length--;
        }

        // DISPLAYLING THE LIST
        public void display() {
            if(head == null) {
                System.out.println("The list is empty.");
                return;
            }
            Node temp = head;
            while(temp!=null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // DISPLAYLING THE LIST IN REVERSE
        public void displayReverse() {
            if(tail == null) {
                System.out.println("The list is empty.");
                return;
            }
            Node temp = tail;
            while(temp!=null) {
                System.out.print(temp.val + " ");
                temp = temp.prev;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DoublyListNode l1 = new DoublyListNode();
        l1.insertAtEnd(10);
        l1.insertAtEnd(20);
        l1.insertAt(1, 100);
        l1.insertAtEnd(30);
        l1.insertAtBeginning(0);
        System.out.print("Displaying the list: ");
        l1.display();
        l1.insertAt(0, 100);
        l1.insertAt(5, 50);
        l1.insertAt(5, 60);
        l1.deleteFromBeginning();
        l1.deleteFromEnd();

        System.out.print("Displaying the list: ");
        l1.display();
        System.out.print("Displaying the list in Reverse: ");
        l1.displayReverse();

        System.out.printf("Head = %d & Tail = %d\nLength of the list: %d", l1.head.val, l1.tail.val, l1.length);
    }
}
