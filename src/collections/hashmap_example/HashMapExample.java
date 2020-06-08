package collections.hashmap_example;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<String, Integer> phonebook = new HashMap<>();
        phonebook.put("Kavin", 12345);
        phonebook.put("Jill", 56970);
        phonebook.put("Brenda", 12321);
        phonebook.put("Brenda", 22222);
        phonebook.put(null, 0000);
        if (phonebook.containsKey("Brenda")) {
            phonebook.remove("Brenda");
        }
        /** Notes:
        * a) HashMaps are unordered. Entries are stored by their contents, not by their position.
        * b) HashMaps do not allow duplicate keys, note that brenda's phone number has been overwritten to 22222
        * c) Hashmaps also allow you to have null as the value for a key
        * d) To remove all entries from a HashMap, you can use phonebook.clear() method */
        System.out.println(phonebook);

    }
}
