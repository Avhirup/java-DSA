import java.util.Stack;

public class Reverse_Stack_Iterative {
    public static void main(String[] args) {
        // WE NEED TO REVERSE THE SAME STACK ST

        // TC: O(n)
        // SC: O(2n) => O(n) [BECAUSE USING 2 EXTRA STACKS]

        Stack<Integer> st = new Stack<>();
        st.push(0);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Before reversing the stack: " + st);

        Stack<Integer> rst = new Stack<>();
        while(!st.isEmpty()) {
            rst.push(st.pop());
        }

        Stack<Integer> nst = new Stack<>();
        while(!rst.isEmpty()) {
            nst.push(rst.pop());
        }

        while(!nst.isEmpty()) {
            st.push(nst.pop());
        }

        System.out.println("After reversing the stack:  " + st);
    }
}
