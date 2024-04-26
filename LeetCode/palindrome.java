public class palindrome {
    public static void main(String[] args) {
        int x = -1;
        int res = 0;
        int check = x;
        while (x > 0) {
            int e = x % 10;
            res = res * 10 + e;
            x /= 10;
        }

        if (res == check)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
