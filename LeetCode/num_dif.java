public class num_dif {

    public static int numDif(int[] arr, int num, int dif) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            // ! APPROACH 1
            // if (arr[i] > num) {
            // if (arr[i] - num <= dif)
            // count++;
            // } else if (arr[i] < num) {
            // if (num - arr[i] <= dif)
            // count++;
            // } else
            // count++;

            // ! APPROACH 2
            int res = Math.abs(arr[i] - num);
            if (res <= dif)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 3, 14, 66, 77, 13, 15 };
        int count = numDif(arr, 13, 2);
        System.out.println(count);
    }
}