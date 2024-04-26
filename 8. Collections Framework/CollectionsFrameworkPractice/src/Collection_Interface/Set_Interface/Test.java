package Collection_Interface.Set_Interface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Hello");
        set.add("Computer");
        set.add("World");
        System.out.println(set);        // [Hello, Computer, World]

        Iterator value = set.iterator();

        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.print(value.next() + " ");
        }
        System.out.println();

        // CONVERTING TO ARRAY
        String[] setArr = set.toArray(new String[set.size()]);
        System.out.println(setArr[1]);

        // USING LOOP ALSO WE CAN ACCESS
        for(String elem: set) {
            System.out.println(elem);
        }

        ArrayList<String> arrList = new ArrayList<>(set);
        System.out.println(arrList.get(2));
    }
}
