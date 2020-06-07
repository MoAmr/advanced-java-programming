package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {

        // Example without generics
        List names = new ArrayList();
        names.add("Mohammed");
        String name = (String) names.get(0);
        System.out.println("First name: " + name);

        //Example with generics
        List<String> names2 = new ArrayList();
        names2.add("Mohammed");
        String name2 = names2.get(0);
        System.out.println("First name: " + name2);
    }
}
