class Q1_moveZeros {

    /*
     * Given Question - Given an integer array arr, move all O's to the end of it
     * while maintaining the relative order of the non-zero elements. Note that you
     * must do this in-place without making a copy of the array.
     */
    public static void main(String[] args) {
        // int[] arr = { 0, 0, 1, 5, 4, 0 };
        int[] arr = { 0, 5, 0, 3, 42 };

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            System.out.println((i) + " no of Iteration");

            for (int j = 0; j < n - 1 - i; j++) {

                /* Swapping values */
                if (arr[j] == 0 && arr[j + 1] != 0) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }

        }

        /* Printing the Array */
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}