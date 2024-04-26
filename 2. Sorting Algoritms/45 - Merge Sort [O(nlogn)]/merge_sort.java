class merge_sort {
    static void printArray(int a[]) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void merge(int a[], int l, int mid, int r) {
        // * defining size for new Arrays */
        int n1 = mid + 1 - l;
        int n2 = r - mid;

        // * defining left Array and right Array */
        int left[] = new int[n1];
        int right[] = new int[n2];

        int i, j, k;
        // * Putting elements into left and right array*/
        for (i = 0; i < n1; i++) {
            left[i] = a[l + i];
        }
        for (j = 0; j < n2; j++) {
            right[j] = a[mid + j + 1];
        }

        // * for comparing two arrays */
        i = 0;
        j = 0;
        k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                a[k++] = left[i++];
            } else {
                a[k++] = right[j++];
            }
        }
        while (i < n1) {
            a[k++] = left[i++];
        }
        while (j < n2) {
            a[k++] = right[j++];
        }

    }

    static void mergeSort(int a[], int l, int r) {
        int mid = (l + r) / 2;
        if (l >= r) {
            return;
        }
        mergeSort(a, l, mid);
        mergeSort(a, mid + 1, r);
        merge(a, l, mid, r);
    }

    public static void main(String[] args) {
        int arr[] = { 7, 20, 4, 11, 8, 2 };
        System.out.print("Array before sorting: ");
        printArray(arr);
        mergeSort(arr, 0, arr.length - 1);
        System.out.print("Array after sorting: ");
        printArray(arr);
    }
}