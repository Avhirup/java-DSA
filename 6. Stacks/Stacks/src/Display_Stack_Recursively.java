import java.util.Stack;

public class Display_Stack_Recursively {
    static void displayStackRecursive(Stack<Integer> st) {
        if(st.isEmpty()) {
            System.out.println();
            return;
        }
        int top = st.pop();
        System.out.print(top + " ");
        displayStackRecursive(st);
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
        displayStackRecursive(st);
        System.out.println(st);
    }
}
