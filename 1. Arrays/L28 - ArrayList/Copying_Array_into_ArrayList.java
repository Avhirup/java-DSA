import java.util.ArrayList;

public class Copying_Array_into_ArrayList {
    public static void main(String[] args) {
        int[] arr = {10, 25, 41, 30, 15};

        ArrayList<Integer> arrList = new ArrayList<>();

        for(int i : arr) {
            arrList.add(Integer.valueOf(i));
        }

        System.out.println(arrList);
    }
}
