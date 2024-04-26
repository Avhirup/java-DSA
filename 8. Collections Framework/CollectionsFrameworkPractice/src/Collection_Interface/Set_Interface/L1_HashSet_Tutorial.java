package Collection_Interface.Set_Interface;

import java.util.HashSet;
import java.util.Set;

public class L1_HashSet_Tutorial {
    public static void main(String[] args) {
//        Set<Integer> hs = new HashSet<>();
        HashSet<Integer> hs = new HashSet<>();      // UNIQUE, UNORDERED ELEMENTS

        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(3);
        hs.add(3);     // Doesn't matter how many times we add 3, only one 3 will be added in the HashSet
        System.out.println(hs);     // [1, 2, 3]

        System.out.println(hs.remove(2));   // true  (and remove 2 from the HashSet)
        System.out.println(hs.remove(5));   // false (and doesn't remove anything from HashSet)

        System.out.println(hs);     // [1, 3]

        System.out.println(hs.contains(3));     // true

        // HashSet is Unordered set
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        System.out.println(hs);     // [1, 50, 3, 20, 40, 30]
    }
}
