// A hash table is a data structure that stores key-value pairs. 
// Each key is hashed to produce an index into an array.
// It has been largely replaced by HashMap in modern Java due.
// Entry<Key,Value>;
// Functions (put, get, remove...(like HashMap));

import java.util.Hashtable;

public class TheHashtable {
    public static void main(String[] args) {
        // HshTable with integer Key
        Hashtable<Integer, String> tableA = new Hashtable<>(10); // Hash value %10
        tableA.put(100, "Jhonbe");
        tableA.put(123, "Alexandra");
        tableA.put(321, "Sandy");
        tableA.put(555, "Iren");
        tableA.put(777, "Guy");

        // table.remove(555);
        for (Integer Key : tableA.keySet()) {
            System.out.println(Key.hashCode() % 10 + "\t" + Key + "\t" + tableA.get(Key));
        }

        // HshTable with string Key
        // (s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]) ==> hash function used to
        // compute the hash code for a string

        Hashtable<String, String> tableB = new Hashtable<>(10); // Hash value %10
        tableB.put("100", "Jhonbe");
        tableB.put("123", "Alexandra");
        tableB.put("321", "Sandy");
        tableB.put("555", "Iren");
        tableB.put("777", "Guy");

        // table.remove(555);
        for (String Key : tableB.keySet()) {
            System.out.println(Key.hashCode() % 10 + "\t" + Key + "\t" + tableB.get(Key));
        }
        // 9 555 Iren
        // 5 777 Guy
        // 5 100 Jhonbe
        // 0 321 Sandy
        // 0 123 Alexandra
        // We have two collisions in hashcodes (5, 0),
        // This can reduce the efficiency of operations like insertions and lookups,
        // To fix it you can use separate chaining (key-value pairs are stored in the
        // same bucket using the linked list),
        // or linear probing (linear probing looks for the next available slot in the
        // hash table) are standard techniques for handling hash
        // collisions.
    }
}