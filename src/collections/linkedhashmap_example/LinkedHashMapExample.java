package collections.linkedhashmap_example;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {

        /**
         * Notes:
         * a) When you use a linked HashMap, the order of the entries is retained.
         *
         * b) With Linked HashMaps, you can specify if you want the elements to be retrieved
         * in the order that they were added in, or in the order that they have been accessed in.
         * To choose between these options, I need to alter the constructor I used when I created the Linked HashMap,
         * in the first line of the main method. I can use a difference constructor that takes three arguments.
         * The first argument is the initial capacity of the map. For example, if I pass in four as the first argument,
         * a linked HashMap with four entries will be created. The second argument is called the Load Factor.
         * This specifies how full the map can be before it is made bigger. For example, I will pass in not .75f,
         * which is actually the default value. This means that when the map is 75% full, it will increase in size.
         * In this case, I have specified that the capacity is four. So when there are three entries in the map,
         * i.e., it is 75% full, the map will get bigger.
         *
         * c) With a linked HashMap, there is an optional third argument. This is a Boolean Value, which specifies
         * the ordering mode. I will set it to false. If it is false, or if it is not specified, it will use the
         * insertion order. This returns the elements in the order that they were inserted into the map.
         */

        LinkedHashMap<String, Integer> phonebook = new LinkedHashMap(4, 0.75f, false);
        phonebook.put("Kavin", 12345);
        phonebook.put("Jill", 12487);
        phonebook.put("Brenda", 123874);
        phonebook.put("Gary", 22222);
        System.out.println("Kavin's number: " + phonebook.get("Kavin"));

        System.out.println("\nList of contacts in phonebokk:");
        for (Map.Entry<String, Integer> entry: phonebook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
