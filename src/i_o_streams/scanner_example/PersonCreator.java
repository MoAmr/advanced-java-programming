package i_o_streams.scanner_example;

import java.util.Scanner;

public class PersonCreator {

    public static void main(String[] args) {

        /** System.in is an input stream used for reading standard input,
         * e.g. from a keyboard in Java. */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = scanner.next();
        System.out.print("Enter the age: ");
        int age = scanner.nextInt();
        System.out.print("Enter phone number: ");
        Long phoneNumber = scanner.nextLong();

        Person person = new Person(name, age, phoneNumber);
    }
}
