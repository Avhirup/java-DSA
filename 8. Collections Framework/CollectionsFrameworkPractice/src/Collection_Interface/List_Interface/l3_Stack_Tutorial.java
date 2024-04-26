package Collection_Interface.List_Interface;

import java.util.Stack;

public class l3_Stack_Tutorial {

    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Hello");
        st.push("world");
        st.add("of Stack");

        // CHECK IF AN ELEMENT IS PRESENT IN THE STACK OR NOT
        System.out.println(st.contains("Hello"));

        Stack<String> st1 = new Stack<>();
        st1.push("Hello");
        st1.push("world");
        st1.add("of Stack");

        // CHECKING IF BOTH THE STACKS ARE EQUAL OR NOT
        System.out.println(st.equals(st1));
    }
}
