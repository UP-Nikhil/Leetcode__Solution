
//https://www.geeksforgeeks.org/problems/reverse-a-stack/1
import java.util.*;

public class RS {
    public static void reverseStack(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }

        int top = st.pop();
        reverseStack(st);
        insertAtBottom(st, top);
    }

    public static void insertAtBottom(Stack<Integer> st, int elem) {
        if (st.isEmpty()) {
            st.push(elem);
            return;
        }
        int top = st.pop();
        insertAtBottom(st, elem);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(6);
        st.push(7);
        st.push(1);
        st.push(2);
        st.push(3);

        reverseStack(st);

        while (!st.empty()) {
            System.out.println(st.pop());
        }
    }
}
