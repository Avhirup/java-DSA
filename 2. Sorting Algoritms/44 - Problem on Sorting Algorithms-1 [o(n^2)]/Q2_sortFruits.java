public class Q2_sortFruits {
    static void sortFruits(String[] f) {
        int n = f.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (f[minIndex].compareTo(f[j]) > 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                String temp = f[i];
                f[i] = f[minIndex];
                f[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        /*
         * Give an array of names of the fruits; you are supposed to sort it in
         * lexicographical order using
         * the selection sort
         * Input ["papaya", "lime", "watermelon", "apple", "mango", "kiwi"]
         * Output: ("apple", "kiwi", "lime", "mango", "papaya", "watermelon"]
         */

        String[] fruits = { "kiwi", "apple", "papaya", "mango" };
        sortFruits(fruits);

        /* Printing the sorted Array */
        for (String str : fruits) {
            System.out.print(str + " ");
        }

    }

    /* try to sort integers in lexicographical order */

}
