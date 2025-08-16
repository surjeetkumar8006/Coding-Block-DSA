
public class MyStack_Client {

    public static void main(String[] args) throws Exception {
        MyStack st = new MyStack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.Display(); // Output: 10 20 30
        System.out.println("Top: " + st.peek()); // Output: 30
        System.out.println("Popped: " + st.pop()); // Output: 30
        st.Display(); // Output: 10 20
    }
}
