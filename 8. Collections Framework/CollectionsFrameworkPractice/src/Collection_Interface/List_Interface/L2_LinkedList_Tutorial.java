package Collection_Interface.List_Interface;

import java.util.LinkedList;

/*
OFFICIAL DOCS: https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html
TO GET TO KNOW ABOUT EVERYTHING ABOUT LINKED LIST

 */


public class L2_LinkedList_Tutorial {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(12);
        l1.add(22);
        l1.add(32);
        l1.add(42);

        System.out.println(l1);

        // set(int index, E element) - Replaces the element at the specified position in this list with the specified element.
        l1.set(1, 200);

        // addFirst(e) : Inserts the specified element at the beginning of this list.
        l1.addFirst(500);

        // addLast(e) : Appends the specified element to the end of this list.
        l1.addLast(50);

        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(655);
        l2.add(556);
        l2.add(567);
        // addAll(int index, Collection c) : Inserts all of the elements in the specified collection into this list, starting at the specified position.
        // if no index is specified, will be added at the last
        l1.addAll(l2);

        l2.pop();
        System.out.println(l2);
        System.out.println(l1);

        System.out.println("l1 & l2 are equal: " + l1.equals(l2));

        // LINKED LIST IT SELF WORKS AS A QUEUE
        System.out.println(l1);     // [500, 12, 200, 32, 42, 50, 655, 556, 567]
        l1.remove();
        System.out.println(l1);

    }
}
