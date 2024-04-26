public class Q2_sqrt_of_non_negative_val {

    static int findSqrt(int x) {
        int[] arr = new int[x / 2];
        int start = 0;
        int end = arr.length - 1;
        int mid, res = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if ((mid + 1) * (mid + 1) == x) {
                res = mid + 1;
                return res;
            } else if ((mid + 1) * (mid + 1) > x)
                end = mid - 1;
            else {
                res = mid + 1;
                start = mid + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int input = 81;
        int res = findSqrt(input);
        System.out.println("Nearest floor Square root value of " + input + " is: " + res);
    }
}
