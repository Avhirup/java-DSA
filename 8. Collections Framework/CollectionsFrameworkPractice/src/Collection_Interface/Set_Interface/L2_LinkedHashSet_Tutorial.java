package Collection_Interface.Set_Interface;

import java.util.LinkedHashSet;

public class L2_LinkedHashSet_Tutorial {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(45);
        lhs.add(36);
        lhs.add(87);
        lhs.add(87);
        System.out.println(lhs);    // [45, 36, 87]
    }
}
