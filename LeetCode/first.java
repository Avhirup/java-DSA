class first {

    static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static int removeDuplicates(int[] nums) {
        int a = 1;
        if (nums.length == 2) {
            if (nums[0] != nums[1])
                return 2;
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[a] = nums[i + 1];
                a++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        // int nums[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int nums[] = { 1, 2, 2 };
        // int nums[] = { 0, 0, 1, 3, 3, 4 };
        int k = removeDuplicates(nums);
        System.out.println(k);
        printArr(nums);
    }
}