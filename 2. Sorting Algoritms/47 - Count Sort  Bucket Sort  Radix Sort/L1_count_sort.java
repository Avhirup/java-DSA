class L1_count_sort {
    static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static int findMax(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    static void basicCountSort(int arr[]) {

        /*
         * PROBLEM WITH BASICCOUNTSORT IS WE HAVE DESTROYED THE STABILITY PROPERTY
         * COMPLETELY
         */
        int max = findMax(arr);
        int[] freqArray = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            freqArray[arr[i]]++;
        }

        int k = 0;
        for (int i = 0; i < freqArray.length; i++) {
            for (int j = 0; j < freqArray[i]; j++) {
                arr[k++] = i;
            }
        }
    }

    public static void main(String[] args) {
        // int arr[] = { 1, 4, 3, 5, 3, 5 };
        int arr[] = { 1, 4, 3, 5, 3, 5, 4, 5, 9, 10, 10, 12, 11, 1, 0 };
        System.out.print("Array before sorting : ");
        printArray(arr);
        basicCountSort(arr);
        System.out.print("Array before sorting : ");
        printArray(arr);
    }
}