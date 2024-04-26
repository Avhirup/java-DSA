class practice_problem1 {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 100 };
        int sum = 0;
        for (int elem : arr) {
            sum += elem;
        }
        System.out.println(sum);
    }
}