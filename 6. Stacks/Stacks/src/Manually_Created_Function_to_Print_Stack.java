import java.sql.SQLOutput;
import java.util.Stack;

public class Manually_Created_Function_to_Print_Stack {

    // STACK IS PASSED BY REFERENCE NOT PASS BY VALUE

    // ITERATIVE APPROACH
    static void printStack(Stack<Integer> st) {     // TC: O(n)   SC: O(n)
        if(st.isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        Stack<Integer> rst = new Stack<>();
        while(st.size() > 0) {
            rst.push(st.pop());
        }
        System.out.print("[ ");
        while (rst.size() > 0) {
            if(rst.size() == 1) {
                System.out.print(st.push(rst.pop()) + " ]" );
            }
            else
                System.out.print(st.push(rst.pop()) + ", ");
        }
        System.out.println();
    }

    // RECURSIVE APPROACH
    public static void displayStack(Stack<Integer> st) {    // TC: O(n)   SC: O(n)
        if(st.isEmpty()) {
            return;
        }
        int top = st.pop();
        displayStack(st);
        System.out.print(top + " ");
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
        // USING LOOPS
//        printStack(st);

        // USING RECURSION
        displayStack(st);
        System.out.println();
        System.out.println(st);
    }
}


/* To optimize this question, we can use an Extra Array instead of using The Extra Stack,
because when we are creating an Extra array with 4 elements, we know that the array is going to take
that 4*4 space only, (4 integers and each integer is taking 4 bytes)
but in case of stack it is not like that, because of it's implementation it will take extra space
 */

// TRY TO IMPLEMENT THIS USNIG ARRAYS