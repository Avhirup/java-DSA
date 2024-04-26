import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Essential_Methods_of_ArrayList {
    public static void main(String[] args) {
        // Q1 - Creating ArrayList from an Array

        //while converting an array to a ArrayList, we need to initialize the array like this
        Integer[] arr = {10, 25, 41, 30, 15};
//        System.out.println(arr[1]);

//        List<Integer> arrList = Arrays.asList(arr);
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(arr));

        // Getting the Maximum element of the List
        int max = Collections.max(arrList);
        System.out.println("Maximum element of the List: " + max);
    }
}