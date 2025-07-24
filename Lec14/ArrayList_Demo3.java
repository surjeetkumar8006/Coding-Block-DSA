import  java.util.*;
public class ArrayList_Demo3 {
    public static void main(String[] args) {
        ArrayList<Integer> ll = new ArrayList<>();// Default capacity 10 size
        ll.add(10);
        ll.add(10);
        ll.add(10);
        ll.add(10);
        ll.add(10);
        ll.add(10);
        ll.add(10);
        ll.add(10);
        ll.add(10);

        for (int val : ll) {
            System.out.print(val+" ");
        }
    }
}
