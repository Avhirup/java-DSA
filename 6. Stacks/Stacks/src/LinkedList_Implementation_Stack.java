public class LinkedList_Implementation_Stack {
    static class Node {
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    static class Stack {
        private Node head;
        private int length = 0;

        int push(int element) {
            Node temp = new Node(element);
            temp.next = head;
            head = temp;
            length++;
            return temp.val;
        }

        int pop() {
            if(head == null) {
                System.out.print("Stack Underflow ");
                return Integer.MIN_VALUE;
            }
            int popped = head.val;
            head = head.next;
            length--;
            return popped;
        }

        int peek() {
            if (head == null) {
                System.out.print("Stack is empty ");
                return Integer.MIN_VALUE;
            }
            return head.val;
        }

        int size() {
            return length;
        }

        boolean isEmpty() {
            if(head == null)
                return true;
            return false;
        }

        void displayHelper(Node temp) {
            if(temp==null){
                return;
            }
            displayHelper(temp.next);
            System.out.print(temp.val + " ");
        }

        void display() {
            if(head == null) {
                System.out.println("Stack is empty.");
                return;
            }
            System.out.print("[ ");
            displayHelper(head);
            System.out.println("]");
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println(st.push(12));
        System.out.println(st.push(22));
        System.out.println(st.push(32));
//        System.out.println(st.push(42));
//        System.out.println(st.push(52));
//        System.out.println(st.push(62));
        st.display();
        System.out.println("Size: " + st.size());
        st.display();
//        System.out.println(st.pop());
//        System.out.println(st.pop());
//        System.out.println(st.pop());
//        System.out.println(st.peek());
    }
}
