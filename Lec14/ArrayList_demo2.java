import java.util.ArrayList;

public class ArrayList_demo2 {
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
        ll.add(10);

        System.out.println(ll);
        System.out.println(ll.size());
        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i));
        }
    }
}
