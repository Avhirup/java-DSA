public class Two_sum {

    public static int searchElement(int[] arr, int val, int stIdx) {
        int idx = -1;
        for (int i = stIdx; i < arr.length; i++) {
            if (arr[i] == val)
                return i;
        }
        return idx;
    }

    public static int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int val1 = nums[i];
            int val2 = target - val1;
            int find = searchElement(nums, val2, i + 1);
            if (find != -1) {
                res[0] = i;
                res[1] = find;
                return res;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 4, 3, 0 };
        int res[] = new int[2];
        res = twoSum(arr, 3);
        System.out.print(res[0] + " " + res[1]);
    }
}
