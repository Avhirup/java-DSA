package Assignments;

import java.util.Scanner;

public class Q2 {

    static String sortString(String s) {
        // solved using Selection sort (time complexity : O(n^2))

        char[] arr = s.toCharArray();
        String res = "";

        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                char temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        // * making the result String */
        for (char c : arr) {
            res += c;
        }

        return res;
    }

    public static void main(String[] args) {
        /*
         * Given a string s, return the string which contains all characters of s in
         * lexicographical order
         * Example:
         * input1: coding
         * Output1: cdgino
         * Input2: abcde
         * Output2: abcde
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String input = sc.next();

        String res = sortString(input);
        System.out.println(res);

    }

}
