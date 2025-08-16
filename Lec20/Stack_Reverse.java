
import java.util.Stack;

public class Stack_Reverse {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        Reverse(st);
        System.out.println(st);

    }

    private static void Reverse(Stack<Integer> st) {
        if (st.isEmpty()) {

            return;
        }
        int x = st.pop();
        Reverse(st);
        Add(st, x);

    }

    private static void Add(Stack<Integer> st, int item) {
        if (st.isEmpty()) {
            st.push(item);
            return;
        }
        int x = st.pop();
        Add(st, item);
        st.push(x);

    }
}
