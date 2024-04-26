import java.util.Stack;

public class Delete_at_any_Index {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        // deleting an element at index 2
        int index = 2;

        Stack<Integer> temp = new Stack<>();
        while(st.size() > index+1) {
            temp.push(st.pop());
        }
        st.pop();
        while(temp.size() > 0) {
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}
