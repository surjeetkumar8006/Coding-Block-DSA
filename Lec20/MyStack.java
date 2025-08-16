
public class MyStack {

    private int[] arr;
    private int idx = -1;

    public MyStack() {
        this(5);
    }

    public MyStack(int n) {
        arr = new int[n];
    }

    public boolean isEmpty() {
        return idx == -1;
    }

    public int size() {
        return idx + 1;
    }

    public boolean isFull() {
        return size() == arr.length;
    }

    public void push(int item) throws Exception {
        if (isFull()) {
            throw new Exception("Stack Full");
        }
        arr[++idx] = item;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack Empty");
        }
        return arr[idx];
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack Empty");
        }
        return arr[idx--];
    }

    public void Display() {
        for (int i = 0; i <= idx; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
