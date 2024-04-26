package Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class L1_HashMap_Tutorial {
    public static void main(String[] args) {
        // CREATING HashMap
        Map<Integer, String> hm = new HashMap<>();
//        HashMap<Integer, String> hm1 = new HashMap<>();

        // NOTE : It stores element in un-ordered manner

        // ADDING ELEMENTS INTO HashMap
        hm.put(2, "Ram");
        hm.put(1, "Shyam");
        hm.put(3, "Laxman");

        System.out.println(hm);     // {1=Shyam, 2=Ram, 3=Laxman}

        // GETTING ELEMENTS FROM HashMap
        System.out.println(hm.get(3));  // Laxman

        // CHECKING IF A KEY IS PRESENT OR NOT IN THE HashMap
        System.out.println(hm.containsKey(10));     // false
        System.out.println(hm.containsKey(2));      // true

        // CHECKING IF AN OBJECT IS PRESENT OR NOT IN THE HashMap
        System.out.println(hm.containsValue("Ram"));    // true

        // ENTERING A DUPLICATE ELEMENT INTO HashMap
        // there are two types of put method
        // put() : doesn't care about the key is already present or not, it either add or overwrite
        hm.put(2, "Rama");
        System.out.println(hm);     // {1=Shyam, 2=Rama, 3=Laxman}

        // putIfAbsent() : only add the value if the key is not already present in the map
        hm.putIfAbsent(3, "Madhu");
        System.out.println(hm);     // {1=Shyam, 2=Rama, 3=Laxman}

        // PRINTING THE WHOLE HashMap
        System.out.println(hm.entrySet());     // [1=Shyam, 2=Rama, 3=Laxman]

        // GETTING ONLY THE KEYS
        System.out.println(hm.keySet());        // [1, 2, 3]

        // GETTING ONLY THE VALUES : Returns a Set view of the keys contained in this map
        System.out.println(hm.values());        // [Shyam, Rama, Laxman]    (this is not an array)

        // Iterate over keys using forEach loop
        for(Integer key : hm.keySet()) {
            System.out.print(key + " ");        // 1 2 3
        }

        System.out.println();

        // Iterate over values using forEach loop
        for(String value : hm.values()) {
            System.out.print(value + " ");        // Shyam Rama Laxman
        }

        // NOTE: After java 10 we don't even need to specify the type of the variable also in forEach, java will detect
        System.out.println();
        for(var value : hm.values()) {
            System.out.print(value + " ");        // Shyam Rama Laxman
        }
        System.out.println();

        // Iterate over Key, value mapping
        for(var e : hm.entrySet()) {
            System.out.println(e);
        }
        /*
            1=Shyam
            2=Rama
            3=Laxman
         */

        // Iterate over Key, value mapping (if needed only value or key)
        for(var e : hm.entrySet()) {
            System.out.print(e.getKey() + " " + e.getValue() + ", ");   // 1 Shyam, 2 Rama, 3 Laxman,
        }

    }
}
