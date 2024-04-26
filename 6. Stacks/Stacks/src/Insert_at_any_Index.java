import java.util.Stack;

public class Insert_at_any_Index {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        // inserting an element at index 2
        int index = 1;
        int element = 10;

        Stack<Integer> temp = new Stack<>();
        while(st.size() > index) {
            temp.push(st.pop());
        }
        st.push(element);
        while(temp.size() > 0) {
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}
