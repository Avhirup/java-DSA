import java.util.ArrayList;

public class P1_Wrapper_Class {
    public static void main(String[] args) {

        // * Wrapper Class
        // Integer i = Integer.valueOf(5);
        // System.out.println(i);

        // Float f = Float.valueOf(5.6f);
        // System.out.println(f);

        // * making ArrayList
        // ArrayList<Boolean> l2 = new ArrayList<>();

        ArrayList<Integer> l1 = new ArrayList<>();
        // ? adding value to ArrayList
        l1.add(5);
        l1.add(6);
        l1.add(7);

        // ? get an element at index i
        l1.get(1); // 6

        // ? print ArrayList with for loop
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i)); // 5, 6, 7
        }

        // ? printing ArrayList directly without loop
        System.out.println(l1); // [5, 6, 7]

        // ? adding element at some index
        l1.add(12);
        System.out.println(l1); // [5, 6, 7, 12]
        l1.add(1, 100);
        System.out.println(l1); // [5, 22, 6, 7, 12]

        // ? modifying element at some index
        l1.set(1, 50);

        // ? removing element at index 0
        l1.remove(0);

        // ? removing an element which's index is not know to us
        // ! IMPORTANT
        l1.remove(Integer.valueOf(12));

        // ? what if we want to delete a value that does not belong to the array
        /*
         * in that case the method will not be able to delete that element
         * and the method actually return us a boolean value
         * if the method is able to delete the element then it retuns 'true' otherwise
         * 'false'
         */
        System.out.println(l1.remove(Integer.valueOf(99)));
        System.out.println(l1);

        // ? checking whether a element exits in the ArrayList or not
        // * the method expects an Integer Object or value or basically a wrapper class
        // and returns boolean */
        boolean ans = l1.contains(Integer.valueOf(50));
        System.out.println(ans);

        // ! ther is a type of ArrayList where we can store any data type
        // ? previously we have specified to have ArrayList of Integer type but if we
        // ? don't specify we can put any data
        ArrayList arr = new ArrayList();
        arr.add("String");
        arr.add(123);
        arr.add(true);

        // ? even we can nest another ArrayList
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(321);
        l2.add(21);

        arr.add(l2);

        System.out.println(arr);

        // ? getting index of an element that doesn't belong to the ArrayList
        System.out.println(l1.indexOf(98)); // -1

        // ? lastIndexOf gives us the last index where the element is present
        l1.add(0, 6);
        System.out.println(l1.lastIndexOf(6)); // 2

        // ? isEmpty returns a boolen value true or false depending upon ArrayList empty
        // or not
        System.out.println(l1.isEmpty());
    }
}