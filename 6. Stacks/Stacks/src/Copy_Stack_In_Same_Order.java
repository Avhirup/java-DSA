import java.util.Stack;
public class Copy_Stack_In_Same_Order {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        // saving elements in reverse order
        Stack<Integer> rst = new Stack<>();
        while(st.size()>0) {
            rst.push(st.pop());
        }

        // saving elements in same order
        while(rst.size()>0) {
            st.push(rst.pop());
        }
        System.out.println(st);
    }
}
