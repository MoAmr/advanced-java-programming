package collections;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        /**
         * Note: If I wanted to insert lots of elements in the middle of the list, or remove lots of elements from
         * the middle, it would be faster to use linked list.
         */
        LinkedList<String> myList = new LinkedList();
        myList.add("A");
        myList.add("B");
        myList.add(1, "C");
        System.out.println(myList);
    }
}
