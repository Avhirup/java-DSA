package Practice_Questions;

import java.util.HashMap;
import java.util.Map;

public class Q1_Max_Frequency {
    public static void main(String[] args) {
        int arr[] = {1, 5 ,8, 1, 1, 3, 4, 8, 3, 4};
        Map<Integer, Integer> freq = new HashMap<>();
        for(int x : arr) {
            if(freq.containsKey(x)) {
                freq.put(x, freq.get(x)+1);
            }
            else {
                freq.put(x, 1);
            }
        }
        System.out.println(freq);
        int maxFreq = 0;
        int key = -1;
        for(Map.Entry<Integer, Integer> e : freq.entrySet()) {
            if(e.getValue() > maxFreq) {
                maxFreq = e.getValue();
                key = e.getKey();
            }
        }
        System.out.printf("Max occurring element is %d, and occurring %d times", key, maxFreq);
    }
}
