public class difference_of_sum {
    public static int differenceofSum(int n, int m) {
        int r1 = 0;
        int r2 = 0;

        for (int i = 1; i <= m; i++) {
            if (i % n != 0)
                r1 += i;
            else
                r2 += i;
        }

        return r1 - r2;
    }

    public static void main(String[] args) {
        System.out.println(differenceofSum(4, 20));
    }
}
