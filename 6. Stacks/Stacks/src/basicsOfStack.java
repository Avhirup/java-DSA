import java.util.Stack;
public class basicsOfStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.isEmpty());           // returns boolean : whether the stack is empty or not
        System.out.println("Size = " + st.size());  // returns integer : the size of the stack
        System.out.println(st);                     // prints the full stack

        // push, pop or peek all the method returns us the integer that is pushed or popped or peeked
    }
}
