class Quick_sort {
    static void printArray(int arr[]) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println("");
    }

    static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int partition(int arr[], int str, int end) {
        int pElem = arr[str];
        int count = 0;
        int i, j;
        for (i = str + 1; i <= end; i++) {
            if (arr[i] <= pElem)
                count++;
        }
        int pIdx = str + count;
        swap(arr, str, pIdx);

        i = str;
        j = end;
        while (i < pIdx && j > pIdx) {
            while (arr[i] <= pElem) {
                i++;
            }
            while (arr[j] > pElem) {
                j--;
            }
            if (i < pIdx && j > pIdx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pIdx;
    }

    static void quickSort(int arr[], int str, int end) {
        if (str >= end) {
            return;
        }
        int pIdx = partition(arr, str, end);
        quickSort(arr, str, pIdx - 1);
        quickSort(arr, pIdx + 1, end);
    }

    public static void main(String[] args) {
        int arr[] = { 7, 5, 13, 8, 2, 10, 4 };
        // int arr[] = { 0, 54, 78, 1, 0, 9 };
        System.out.print("Array Before Sorting: ");
        printArray(arr);
        quickSort(arr, 0, arr.length - 1);
        System.out.print("Array after Sorting: ");
        printArray(arr);
    }
}