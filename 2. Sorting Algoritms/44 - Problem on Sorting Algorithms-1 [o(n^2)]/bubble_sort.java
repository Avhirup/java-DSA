public class bubble_sort {
    public static void main(String[] args) {
        /* bubble sort */
        int[] arr = { 7, 8, 12, 5, 9, 1 };
        // int[] arr = { 1, 2, 3, 4 };
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            System.out.println((i + 1) + " no of Iteration");
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
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
        /* Printing the sorted Array */
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
