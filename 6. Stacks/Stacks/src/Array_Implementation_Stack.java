public class Array_Implementation_Stack {
    static class Stack {
//        private int arr[] = new int[5];
        private int[] arr;
        Stack(int size){
            arr = new int[size];
        }
        private int idx = 0;
        int push(int elem) {
            if(isFull()) {
                System.out.print("Stack overflow ");
                return Integer.MIN_VALUE;
            }
            arr[idx++] = elem;
            return elem;
        }
        int pop() {
            if(idx == 0) {
                System.out.print("Stack underflow ");
                return Integer.MIN_VALUE;
            }
            arr[idx-1] = 0;
            return arr[--idx];
        }
        int peek() {
            if(idx == 0) {
                System.out.print("Stack underflow ");
                return Integer.MIN_VALUE;
            }
            return arr[idx-1];
        }
        int size() {
            return idx;
        }
        void display() {
            if(idx == 0) {
                System.out.println("Stack is empty.");
                return;
            }
            System.out.print("[ ");
            for(int i=0 ; i<idx ; i++) {
                if(i == idx-1) {
                    System.out.print(arr[i] + " ]");
                }
                else {
                    System.out.print(arr[i] + ", ");
                }
            }
            System.out.println();
        }
        boolean isEmpty() {
            if(idx == 0) {
                return true;
            }
            return false;
        }
        boolean isFull() {
            if(idx == arr.length) return true;
            return false;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack(5);
        System.out.println(st.push(12));
        System.out.println(st.push(22));
        System.out.println(st.push(32));
        System.out.println(st.push(42));
        System.out.println(st.push(52));
        System.out.println(st.push(62));
//        System.out.println(st.pop());
//        System.out.println(st.pop());
        System.out.println("Size of the Stack: " + st.size());
        st.display();
    }
}

