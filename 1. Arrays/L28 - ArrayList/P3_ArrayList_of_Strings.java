import java.util.ArrayList;
import java.util.Collections;

public class P3_ArrayList_of_Strings {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Welcome");
        l1.add("To");
        l1.add("Physics");
        l1.add("Wallah");
        System.out.println("Original List: " + l1);

        Collections.sort(l1);
        System.out.println("Asce Order Sorted List: " + l1);

        Collections.sort(l1, Collections.reverseOrder());
        System.out.println("Desc Order Sorted List: " + l1);
    }

}
