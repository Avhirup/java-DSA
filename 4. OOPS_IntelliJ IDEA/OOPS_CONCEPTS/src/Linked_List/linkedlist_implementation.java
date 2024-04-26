package Linked_List;
public class linkedlist_implementation {

    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;
        int length = 0;
        // INSERT AT THE END
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if(head == null)
                head = temp;
            else
                tail.next = temp;
            tail = temp;
            length++;
        }

        // INSERT AT THE BEGINNING
        void insertAtBeginning(int val) {
            Node temp = new Node(val);
            if(head==null && tail==null)
                head=tail=temp;
            else {
                temp.next = head;
                head = temp;
            }
            length++;
        }

        // INSERT A NODE AT ANY GIVEN INDEX
        void insertAt(int index, int val) {
            if((head==null && tail==null) || index == 0) {
                insertAtBeginning(val);
                return;
            }
            else if (index == this.length) {
                insertAtEnd(val);
                return;
            } else if (index<0 || index>this.length) {
                System.out.println("Not a valid index ");
                return;
            } else {
                Node newNode = new Node(val);
                Node temp = head;
                for(int i=0 ; i<index-1 ; i++) {
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;
            }
            length++;
        }

        // METHOD TO GET AN ELEMENT AT A PARTICULAR INDEX
        int getElementAt(int index) {
            if(head == null && tail == null) {
                System.out.print("Linked List is empty. ");
                return index;
            }
            else if (index<0 || index>=this.length) {
                System.out.print("Not a valid index ");
                return -1;
            }
            Node temp = head;
            for(int i=0 ; i<index ; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        // DELETE A NODE FROM THE BEGINNING
        void deleteFromBeginning() {
            if(head == null)
                return;
            head = head.next;
            length--;
        }

        // DELETE A NODE FROM THE END
        void deleteFromEnd() {
            if(head == null || head == tail) {
                head = tail = null;
                length = 0;
                return;
            }
            Node temp = head;
            while(temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            length--;
        }

        // DELETE A NODE FROM A GIVEN INDEX
        void deleteAt(int index) {
            if(index < 0  || index>=length)
                System.out.println("Invalid Index");
            else if (index == 0) {
                deleteFromBeginning();
            } else if (index == length-1) {
                deleteFromEnd();
            }
            else {
                Node temp = head;
                for(int i=0 ; i<index-1 ; i++)
                    temp = temp.next;
                temp.next = temp.next.next;
                length--;
            }
        }

        void display() {
            Node temp = head;
            while(temp!=null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        linkedlist l1 = new linkedlist();
        l1.insertAtEnd(5);
        l1.insertAtEnd(15);
        l1.insertAtEnd(25);
        l1.insertAtBeginning(250);
        l1.display();
//        l1.insertAt(20, 20);
        l1.insertAtBeginning(100);
//        l1.insertAt(-1, 400);
        l1.insertAt(4, 400);
        l1.display();                       // 100 250 5 15 400 25
        System.out.println(l1.length);      // 6
        l1.deleteFromBeginning();           // 250 5 15 400 25
        l1.deleteFromEnd();                 // 250 5 15 400
//        l1.deleteFromEnd();                 // 250 5 15
//        l1.deleteFromEnd();                 // 250 5
//        l1.deleteFromEnd();                 // 250
//        l1.display();
//        l1.deleteFromEnd();                 //
        l1.display();                        // 250 5 15 400
        l1.deleteAt(0);
        l1.deleteFromEnd();
        l1.display();
        System.out.println(l1.head.data);
        System.out.println(l1.tail.data);
        System.out.println(l1.length);
    }
}
