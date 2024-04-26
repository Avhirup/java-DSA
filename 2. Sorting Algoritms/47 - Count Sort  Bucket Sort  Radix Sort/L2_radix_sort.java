public class L2_radix_sort {

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

    static void stableCountSort(int arr[], int place) {
        int freqArr[] = new int[10];

        // * CREATING FREQUENCY ARRAY
        for (int i = 0; i < arr.length; i++) {
            freqArr[(arr[i] / place) % 10]++;
        }

        // * CONVERTING FREQUENCY ARRAY TO PREFIX SUM ARRAY
        for (int i = 1; i < freqArr.length; i++) {
            freqArr[i] += freqArr[i - 1];
        }

        // * CREATING THE RESULT ARRAY
        int res[] = new int[arr.length];
        for (int i = res.length - 1; i >= 0; i--) {
            int idx = freqArr[(arr[i] / place) % 10] - 1;
            res[idx] = arr[i];
            freqArr[(arr[i] / place) % 10]--;
        }

        for (int i = 0; i < res.length; i++) {
            arr[i] = res[i];
        }
    }

    static void radixSort(int[] arr) {
        int max = findMax(arr);
        for (int i = 1; max / i > 0; i *= 10) {
            stableCountSort(arr, i);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 803, 12, 75, 99, 112 };
        // int arr[] = { 1, 4, 3, 5, 3, 5, 4, 5, 9, 10, 10, 12, 11, 1, 0 };
        System.out.print("Array before sorting: ");
        printArray(arr);
        radixSort(arr);
        System.out.print("Array after sorting: ");
        printArray(arr);
    }
}
