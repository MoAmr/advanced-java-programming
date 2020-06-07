package generics;

public class Varargs {

    public static void main(String[] args) {
        String item1 = "Apples";
        String item2 = "Oranges";
        String item3 = "Pears";
        //String[] shopping = {"Bread", "Milk", "Eggs", "Banana"};
        printShoppingList(item1, item2, item3);
        printShoppingList("Bread", "Milk", "Eggs", "Banana");
    }

    // Varargs replace the need for this method.
    /*
    public static void printShoppingList(String str1, String str2) {
        System.out.println("SHOPPING LIST");
        System.out.println("1. " + str1);
        System.out.println("2. " + str2);
    }*/

    // Varargs replace the need for this method.
    /*
    public static void printShoppingList(String str1, String str2, String str3) {
        System.out.println("SHOPPING LIST");
        System.out.println("1. " + str1);
        System.out.println("2. " + str2);
        System.out.println("3. " + str3);
        System.out.println();
    }*/

    public static void printShoppingList(String... items) {
        System.out.println("SHOPPING LIST");
        for (int i = 0; i < items.length; i++) {
            System.out.println(i + 1 + ": " + items[i]);
        }
        System.out.println();
    }

}
