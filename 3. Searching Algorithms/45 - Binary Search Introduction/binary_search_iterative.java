class binary_search_iterative {

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == target)
                return mid;
            if (arr[mid] > target)
                end = mid - 1;
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 15, 24, 30, 50 };
        int target = 50;
        int idx = binarySearch(arr, target);
        if (idx == -1)
            System.out.println("Element is not present in the array.");
        else
            System.out.println("Element is present at the index " + idx + ".");
    }
}