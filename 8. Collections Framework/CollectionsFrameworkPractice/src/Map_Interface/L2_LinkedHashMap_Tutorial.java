package Map_Interface;

import java.util.LinkedHashMap;
import java.util.Map;

public class L2_LinkedHashMap_Tutorial {
    public static void main(String[] args) {
        Map<Integer, String> lhm = new LinkedHashMap<>();

        // NOTE : It stores element in ordered manner (ORDER OF INSERTION IS PRESERVED)

        // ADDING ELEMENTS INTO HashMap
        lhm.put(2, "Ram");
        lhm.put(1, "Shyam");
        lhm.put(3, "Laxman");

        System.out.println(lhm);        // {2=Ram, 1=Shyam, 3=Laxman}
    }
}
