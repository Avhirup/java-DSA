import java.util.Stack;

public class Push_at_Buttom_Recursion {
    static void pushAtButtom(Stack<Integer> st, int element){
        if(st.isEmpty()){
            st.push(element);
            return;
        }
        int top = st.pop();
        pushAtButtom(st, element);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        pushAtButtom(st, 6);
        System.out.println(st);
    }
}
