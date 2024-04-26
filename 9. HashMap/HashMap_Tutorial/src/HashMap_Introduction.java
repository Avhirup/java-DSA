import java.util.*;

public class HashMap_Introduction {
    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap<>();

        // ADDING ELEMENT INTO HASHMAP
        mp.put("Akash", 21);
        mp.put("Yash", 16);
        mp.put("Lav", 17);
        mp.put("Harry", 18);
        mp.put("Rishika", 19);
        mp.put("rishika", 19);
        System.out.println(mp);         // {Lav=17, Rishika=19, Yash=16, Harry=18, Akash=21}

        // GETTING ELEMENT FROM HASHMAP
        System.out.println(mp.get("Harry"));        // 18

        // REMOVING ELEMENT FROM HASHMAP (ELEMENT -> KEY : VALUE)
        System.out.println(mp.remove("Akash"));     // 21
        System.out.println(mp.remove("Aratrika"));  // null

        // CHECKING IF A KEY IS PRESENT IN THE HASHMAP OR NOT
        System.out.println(mp.containsKey("Rahul"));    // false
        System.out.println(mp.containsKey("Lav"));    // true

        // CHECKING IF A VALUE IS PRESENT IN THE HASHMAP OR NOT
        System.out.println(mp.containsValue(12));    // false
        System.out.println(mp.containsValue(19));    // true

// IMPORTANT : ADDING A NEW ELEMENT ONLY IF KEY DOESN'T EXISTS ALREADY
        // way1 : Manually
        if(!mp.containsKey("Yash")) mp.put("Yash", 166);

        // way2 : using putIfAbsent method
        mp.putIfAbsent("Yash", 166);

// IMPORTANT : HashMap allows null key also but only once and multiple null values
        mp.put(null, 15);
        mp.put("abc", null);

        // PRINTING ALL THE KEYS ( Returns a Set view of the keys contained in this map )
        System.out.println(mp.keySet());    // [Lav, Rishika, Yash, Harry] ( this a Set containing String )

        // PRINTING ALL THE VALUES  ( Returns a Collection view of the values contained in this map )
        System.out.println(mp.values());    // [17, 19, 16, 18]     ( this a Collection containing Integer )

        // PRINTING ALL THE ELEMENTS/ENTRIES  ( Returns a Set view of the mappings contained in this map )
        System.out.println(mp.entrySet());  // [Lav=17, Rishika=19, Yash=16, Harry=18]

        // TRAVERSING THE HASHMAP
        /* as all the methods of HashMap returns either Set or Collection view, thus we cannot
        traverse the keys or values of the HashMap like normal array.
        Insted we need to use the ForEach method
        */

        // here keys are String in case of the HashMap we are using
        System.out.println("Printing the Keys of HashMap --> ");
        for(String key : mp.keySet()) {
            System.out.println(key);
        }

        /*
            We know that .entrySet() returns a set view of the Mappings exists in the HashMap
            and type of Mappings is Entry<k, V> ( basically each entry is of type Entry<K, V> )
        */
        System.out.println("\nPrinting the HashMap --> ");
        for(Map.Entry<String, Integer> e : mp.entrySet()) {
            System.out.printf("Key %s : value %d\n", e.getKey(), e.getValue());
        }

        // THERE IS A SIMPLER SYNTAX AVAILABLE OF FOR-EACH (AFTER JAVA 10+ VERSION)
        System.out.println("\nPrinting the HashMap USING SIMPLER APPROACH--> ");
        for(var e : mp.entrySet()) {
            System.out.printf("Key %s : value %d\n", e.getKey(), e.getValue());
        }
    }
}
