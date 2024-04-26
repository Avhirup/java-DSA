package Collection_Interface.List_Interface;

import java.util.ArrayList;
/*
all the classes of Collection Framework exists into 'java.util' package
in order to import all -> 'import java.util.*'

--> REFER TO THE OFFICIAL DOCUMENTATION IN ORDER TO KNOW ALL THE METHODS OF ARRAYLIST
 */

public class L1_ArrayList_Tutorial {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();

        // ADDING ELEMENTS - Appends the specified element to the end of this list.
        l1.add(10);
        l1.add(20);
        l1.add(30);

        // 	get(int index) - GETTING ELEMENTS FROM INDEX i
        System.out.println(l1.get(1));

        // set(int index, E element) - SETTING / MODIFYING ELEMENTS AT INDEX i
        l1.set(1, 200);     // index, newVal
        System.out.println(l1.get(1));

        // contains(Object o) - Returns true if this list contains the specified element.
        System.out.println(l1.contains(200));

        // PRINTING THE FULL ARRAYLIST
        System.out.println(l1);         // [10, 200, 30]

        // remove(int index) - Removes the element at the specified position in this list.
        l1.remove(1);
        System.out.println(l1);         // [10, 30]

        // indexOf(Object o) - Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
        System.out.println(l1.indexOf(30)); // 1

        // 	isEmpty() - Returns true if this list contains no elements.
        System.out.println(l1.isEmpty());   // false

        // size() - Returns the number of elements in this list.
        System.out.println(l1.size());      // 2

        // clear() - Removes all of the elements from this list.
        l1.clear();
        System.out.println(l1);         // []

        // GET TO KNOW ABOUT THIS METHODS
        /*

        	toArray() - Returns an array containing all of the elements in this list in proper sequence (from first to last element).
        	clone() - Returns a shallow copy of this ArrayList instance.

         */
    }
}
