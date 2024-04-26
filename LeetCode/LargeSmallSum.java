import java.util.ArrayList;
import java.util.Collections;

public class LargeSmallSum {
    public static int sumOfLargeSmall(int arr[]) {
        if (arr.length <= 3)
            return 0;
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        even.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 0)
                even.add(arr[i]);
            else
                odd.add(arr[i]);
        }

        Collections.sort(even);
        Collections.sort(odd);

        return odd.get(1) + even.get(even.size() - 2);

    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 1, 7, 5, 4 };
        System.out.println(sumOfLargeSmall(arr));
    }

}
