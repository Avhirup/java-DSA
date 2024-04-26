import java.util.*;
import java.util.Collection;

public class P2_Reverse_ArrayList {
    static void reverseList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            int item = list.get(i);
            list.set(i, list.get((list.size() - 1) - i));
            list.set((list.size() - 1) - i, item);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the List: ");
        int size = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element for index " + i + " : ");
            int elem = sc.nextInt();
            list.add(elem);
        }
        System.out.println("Original List: " + list);
        reverseList(list);
        System.out.println("Reversed List: " + list);
        /*
         * Another way to Reverse an ArrayList is by using the in-built method of
         * collections class
         */
        // Collections.reverse(list);
        // System.out.println(list);

        /*
         * We can do sorting also
         */
        // ! Ascending order sorting
        Collections.sort(list);

        // ! Descending order sorting (here we need to pass comparator)
        Collections.sort(list, Collections.reverseOrder());

    }
}
