import java.util.*;

public class Multi_Dimantional_List {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        mainList.add(list);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        mainList.add(list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(11);
        list2.add(12);
        list2.add(13);
        list2.add(14);
        list2.add(15);
        list2.add(16);
        mainList.add(list2);
        // for (ArrayList<Integer> subList : mainList) {
        // System.out.println(subList);
        // System.out.println(subList.size());
        // }

        for (ArrayList<Integer> subList : mainList) {
            for (int val : subList) {
                System.out.print(val + " ");
            }
            System.out.println(); // for new line after each sublist
        }
    }
}
