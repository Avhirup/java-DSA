public class triangle {

    public static boolean isPrime(int num) {
        if (num == 1 || num == 0)
            return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int row = 6;
        int n = 2;
        for (int i = 1; i <= row; i++) {
            // ! SPACES
            for (int j = 1; j <= row - i; j++)
                System.out.print("  ");

            // ! STAR
            for (int j = 1; j <= i; j++)

                while (true) {
                    if (isPrime(n)) {
                        System.out.print(n + "  ");
                        n++;
                        break;
                    } else
                        n++;
                }

            System.out.println();
        }

    }
}