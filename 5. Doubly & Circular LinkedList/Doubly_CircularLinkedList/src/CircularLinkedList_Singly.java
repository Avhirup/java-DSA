public class CircularLinkedList_Singly {
    public static class CLLSNode {
        int val;
        CLLSNode next;
        CLLSNode(int val) {
            this.val = val;
        }
    }
    public static class CircularSingleList {
        CLLSNode head = null;
        CLLSNode tail = null;
        int length = 0;

        void insertAtBeginning(int val){
            CLLSNode temp = new CLLSNode(val);
            if(head == null) {
                head = tail = temp;
                tail.next = head;
            }
            else {
                temp.next = head;
                tail.next = temp;
                head = temp;
            }
            length++;
        }
        void insertAtEnd(int val) {
            CLLSNode temp = new CLLSNode(val);
            if(head == null) {
                insertAtBeginning(val);
                return;
            }
            else{
                tail.next = temp;
                tail = temp;
                tail.next = head;
            }
            length++;
        }

        void insertAt(int index, int val) {
            if(head == null || index == 0) {
                insertAtBeginning(val);
            } else if (index<0 || index>length) {
                System.out.println(index + " : Index out of bound.");
            }
            else if (index == length) {
                insertAtEnd(val);
            }
            else {
                CLLSNode nn = new CLLSNode(val);
                CLLSNode temp = head;
                for(int i=0 ; i<index-1 ; i++) {
                    temp = temp.next;
                }
                nn.next = temp.next;
                temp.next = nn;
                length++;
            }
        }

        // H.W
        void deleteFromStart() {
            if(head == null) {
                System.out.println("List is already empty.");
            } else if (tail == head) {
                head = tail = null;
                System.out.println("List is become empty now");
                length--;
            }
            else {
                head = head.next;
                tail.next = head;
                length--;
            }
        }
        void displayList() {
            if(head == null) {
                System.out.println("List is empty.");
                return;
            }
            CLLSNode temp = head;
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
        CircularSingleList l1 = new CircularSingleList();
        l1.insertAtEnd(2);
        l1.insertAtEnd(3);
        l1.insertAtBeginning(1);
        l1.insertAtEnd(4);
        l1.insertAt(2, 5);
        l1.deleteFromStart();
        l1.displayList();
        System.out.printf("Head = %d, Tail = %d & Length: %d", l1.head.val, l1.tail.val, l1.length);
    }
}



