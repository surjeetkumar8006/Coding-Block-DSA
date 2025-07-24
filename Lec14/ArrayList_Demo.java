import java.util.*;

public class ArrayList_Demo {
    public static void main(String[] args) {
        ArrayList<Integer> ll = new ArrayList<>();

        // Add

        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);

        ll.set(2, 3000);
        System.out.println(ll.get(1));
        System.out.println(ll);
        System.out.println(ll.size());
        System.out.println(ll.remove(1));
        System.out.println(ll);
        Collections.sort(ll);
        System.out.println(ll);

    }
}
