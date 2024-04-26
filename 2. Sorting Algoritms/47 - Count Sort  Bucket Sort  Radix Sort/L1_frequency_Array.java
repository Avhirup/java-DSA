public class L1_frequency_Array {
    static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > max)
                max = i;
        }

        return max;
    }

    static void frequenyArray(int[] arr) {
        int max = findMax(arr);
        int freqArr[] = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            freqArr[arr[i]]++;
        }
        System.out.print("This is the frequency array for the given array: ");
        printArray(freqArr);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 5, 2, 3, 1, 1, 4, 2, 3 };
        printArray(arr);
        frequenyArray(arr);
    }
}
