package Collection_Interface.Set_Interface.SortedSet_Interface;

import java.util.Set;
import java.util.TreeSet;

public class L1_TreeSet_Tutorial {
    public static void main(String[] args) {
        Set<Integer> ts = new TreeSet<>();
        ts.add(1400);
        ts.add(1680);
        ts.add(1000);
        ts.add(2650);
        ts.add(2650);
        ts.add(2650);       // Doesn't contain duplicate elements + Maintain sorted order
        System.out.println(ts);     // [1000, 1400, 1680, 2650]
    }
}
