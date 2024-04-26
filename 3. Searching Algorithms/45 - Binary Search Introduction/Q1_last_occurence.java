public class Q1_last_occurence {

    static int firstOccurence(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        int lo = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                lo = mid;
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return lo;
    }

    public static void main(String[] args) {
        // * Have to provide sorted array
        int[] arr = { 3, 3, 5, 5, 5, 5, 7, 8, 8 };

        int target = 5;

        int lo = firstOccurence(arr, target);
        if (lo == -1) {
            System.out.println("Element is not present in the array");
        } else {
            System.out.println("First Occurence of element " + target + " is at index: " + lo);
        }

    }
}
