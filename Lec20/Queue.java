
public class Queue {

    private int[] arr;
    private int front = 0;
    private int size = 0;

    public Queue() {
        this(5);
    }

    public Queue(int n) {
        arr = new int[n];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public int size() {
        return size;
    }

    public void Equeue(int item) throws Exception {
        if (isFull()) {
            throw new Exception("Queue Full");
        }
        int idx = (front + size) % arr.length;
        arr[idx] = item;
        size++;
    }

    public int Dqueue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue Empty");
        }
        int x = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return x;
    }

    public int getFront() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue Empty");
        }
        return arr[front];
    }

    public void Display() {
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % arr.length;
            System.out.print(arr[idx] + " ");
        }
        System.out.println();
    }
}
