package functional.streams;

import java.util.ArrayList;

public class Library {

    public static void main(String[] args) {
        ArrayList<Book> books = populateLibrary();

        books.stream()
                // The filter method I used in this example is a lazy method.
                .filter(book -> {
                    return book.getAuthor().startsWith("J");
                })
                .filter(book -> {
                    return book.getTitle().startsWith("E");
                })
                // Eager Method
                .forEach(System.out::println);
    }

    static ArrayList<Book> populateLibrary() {
        ArrayList<Book> books = new ArrayList();
        books.add(new Book("Alice Walker", "The Color Purple"));
        books.add(new Book("Alice Walker", "Meridian"));
        books.add(new Book("Toni Morrison", "Beloved"));
        books.add(new Book("Toni Morrison", "Jazz"));
        books.add(new Book("Toni Morrison", "Paradise"));
        books.add(new Book("John Steinbeck", "The Grapes of Wrath"));
        books.add(new Book("John Steinbeck", "East of Eden"));
        books.add(new Book("Kazuo Ishiguro", "The Remains of the Day"));
        books.add(new Book("Kazuo Ishiguro", "Never Let Me Go"));
        books.add(new Book("Kazuo Ishiguro", "The Buried Giant"));
        books.add(new Book("Jane Austen", "Pride and Prejudice"));
        books.add(new Book("Jane Austen", "Emma"));
        books.add(new Book("Jane Austen", "Persuasion"));
        books.add(new Book("Jane Austen", "Mansfield Park"));
        books.add(new Book("Chinua Achebe", "Things Fall Apart"));
        books.add(new Book("Chinua Achebe", "No Longer at Ease"));
        books.add(new Book("Chinua Achebe", "Home and Exile"));
        return books;
    }
}


