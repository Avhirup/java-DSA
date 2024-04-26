public class L1_stable_count_sort {

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

    static int[] stableCountSort(int arr[]) {
        int max = findMax(arr);
        int freqArr[] = new int[max + 1];

        // * CREATING FREQUENCY ARRAY
        for (int i = 0; i < arr.length; i++) {
            freqArr[arr[i]]++;
        }

        // * CONVERTING FREQUENCY ARRAY TO PREFIX SUM ARRAY
        for (int i = 1; i < freqArr.length; i++) {
            freqArr[i] += freqArr[i - 1];
        }

        // * CREATING THE RESULT ARRAY
        int res[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            int idx = freqArr[arr[i]] - 1;
            res[idx] = arr[i];
            freqArr[arr[i]]--;
        }

        return res;
    }

    public static void main(String[] args) {
        // int arr[] = { 5, 2, 4, 2, 1, 5 };
        int arr[] = { 1, 4, 3, 5, 3, 5 };
        // int arr[] = { 1, 4, 3, 5, 3, 5, 4, 5, 9, 10, 10, 12, 11, 1, 0 };
        System.out.print("Array before sorting: ");
        printArray(arr);
        System.out.print("Array after sorting: ");
        int resArr[] = stableCountSort(arr);
        printArray(resArr);
    }
}
