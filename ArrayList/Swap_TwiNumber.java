import java.util.*;

public class Swap_TwiNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);
        int inx1 = 1, ind2 = 3;
        print(list, inx1, ind2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }

    public static void print(ArrayList<Integer> list, int inx1, int inx2) {
        int temp = list.get(inx1);
        list.set(inx1, list.get(inx2));
        list.set(inx2, temp);
    }

}
