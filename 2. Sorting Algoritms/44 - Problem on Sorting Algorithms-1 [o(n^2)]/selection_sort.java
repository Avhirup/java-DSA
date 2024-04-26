public class selection_sort {
    public static void main(String[] args) {
        /* selection sort */
        int[] arr = { 8, 12, 5, 9, 1 };

        for (int i = 0; i < arr.length - 1; i++) {

            int lowest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[lowest] > arr[j]) {
                    /* changing the lowest value */
                    lowest = j;
                }
            }

            if (lowest != i) {
                /* Swapping the lowest value with i th index */
                int temp = arr[i];
                arr[i] = arr[lowest];
                arr[lowest] = temp;
            }

        }

        /* Printing the sorted Array */
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
