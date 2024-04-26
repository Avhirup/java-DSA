public class practice_problem2 {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 3 };
        int max = arr[0];
        for (int i : arr) {
            if (i > max)
                max = i;
        }
        System.out.println(max);
    }
}