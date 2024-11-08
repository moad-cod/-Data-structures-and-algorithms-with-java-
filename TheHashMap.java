// ==>What's mean HashMao
// HashMap implements the Map interface (need import)
// HashMap is similar to ArrayList , but with key-value pairs
// Stores objects, need to use Wrapper class
// Wrapper class ==> Wrapper a primitive data type into an object
// functions (put, remove, get, clear, size, replace, cotainsKey, containsValue, keySet())

import java.util.HashMap;

public class TheHashMap {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        // Append to the hashmap
        map.put("Moroco", "Rabat");
        map.put("Algeria", "Algeria");
        map.put("Qatar", "Doha");
        map.put("Turkey", "Ankara");
        // Remove a countrie from a country from the map
        map.remove("MOROCO");
        // Clear the map
        map.clear();
        // Size of the map
        System.out.println(map.size());
        // replace a value in the map
        map.replace("MOROCO", "CASA"); // MOROCO=CASA
        // Recherche for if a key is exist or not
        System.out.println(map.containsKey("Moroco"));
        // Recherche for if a value is exist or not
        System.out.println(map.containsValue("Rabat"));
        for (String i : map.keySet()) {
            System.out.println(i + " = " + map.get(i));
        }
        System.out.println(map);
    }
}
