package Lec22;

import Lec20.MyStack;

public class Dynamic_Stack extends MyStack {

    @Override
    public void push(int item) throws Exception {
        // check if stack is full
        if (isFull()) {
            // double the size of stack
            int newSize = size() * 2;
            // create temporary array
            int[] temp = new int[newSize];

            // copy elements from old stack using pop and push to temp array
            for (int i = 0; i < size(); i++) {
                temp[i] = pop();
            }

            // push elements back to stack
            for (int i = 0; i < size(); i++) {
                super.push(temp[i]);
            }
        }
        super.push(item);
    }

    public static void main(String[] args) throws Exception {
        Dynamic_Stack ds = new Dynamic_Stack();
        ds.push(10);
        ds.push(20);
        ds.push(30);
        ds.push(40);
        ds.push(50);
        ds.push(60); // should work even if initial size was 5
        ds.Display();
    }
}
