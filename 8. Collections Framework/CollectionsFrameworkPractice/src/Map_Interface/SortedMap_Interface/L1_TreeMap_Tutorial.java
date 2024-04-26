package Map_Interface.SortedMap_Interface;

import java.util.Map;
import java.util.TreeMap;

public class L1_TreeMap_Tutorial {
    public static void main(String[] args) {
        Map<Integer, String> tm = new TreeMap<>();
        // NOTE: Sorted map according to key in Increasing order

        // ADDING ELEMENTS INTO TreeMap
        tm.put(100, "Krisna");
        tm.put(2, "Ram");
        tm.put(1, "Shyam");
        tm.put(3, "Laxman");

        System.out.println(tm);        // {1=Shyam, 2=Ram, 3=Laxman, 100=Krisna}
    }
}
