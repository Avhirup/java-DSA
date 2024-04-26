public class binary_search_recursive {
    static int binarySearch(int[] arr, int start, int end, int target) {
        if (start > end)
            return -1;

        int mid = start + (end - start) / 2;
        if (arr[mid] == target)
            return mid;
        if (arr[mid] > target)
            return binarySearch(arr, start, mid - 1, target);
        else
            return binarySearch(arr, mid + 1, end, target);
    }

    public static void main(String[] args) {
        int arr[] = { 12, 15, 24, 30, 50 };
        int target = 12;
        int idx = binarySearch(arr, 0, arr.length - 1, target);
        if (idx == -1)
            System.out.println("Element is not present in the array.");
        else
            System.out.println("Element is present at the index " + idx + ".");
    }
}
