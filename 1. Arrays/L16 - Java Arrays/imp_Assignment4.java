import java.util.Arrays;

public class imp_Assignment4 {
    public static void main(String[] args) {
        int a[] = { 1, 423, 6, 46, 34, 23, 13, 53, 4, -58 };

        // ! MAX & MIN USING STREAM
        // int min = Arrays.stream(a).min().getAsInt();
        // int max = Arrays.stream(a).max().getAsInt();
        // System.out.println(min);
        // System.out.println(max);

        // ! MAX & MIN USING SORT
        Arrays.sort(a);
        System.out.println("Max " + a[a.length - 1]);
        System.out.println("Min " + a[0]);
    }
}
