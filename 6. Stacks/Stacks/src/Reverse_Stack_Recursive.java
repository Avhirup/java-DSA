import java.util.Stack;

public class Reverse_Stack_Recursive {
    public static void insertAtBottom(Stack<Integer> st, int elem) {
        Stack<Integer> rst = new Stack<>();
        while(st.size() >= 1) {
            rst.push(st.pop());
        }
        st.push(elem);
        while (!rst.isEmpty()) {
            st.push(rst.pop());
        }
    }
    public static void reverseStack(Stack<Integer> st) {
        if(st.size() == 1) {
            return;
        }
        int top = st.pop();
        reverseStack(st);
        insertAtBottom(st, top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Before reversing the stack: " + st);

        reverseStack(st);
        System.out.println("After reversing the stack:  " + st);
    }
}
