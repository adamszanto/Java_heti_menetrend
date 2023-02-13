package exercise08;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Bulgakov", "The Master and Margarita", 1967);
        Book book2 = new Book("James Joyce", "Ulysses", 1922);
        Book book3 = new Book("Gabriel Garcia Marquez", "One Hundred Years of Solitude", 1967);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        Library library = new Library(books);
        System.out.println(library.getBooks().get(0).getTitle());
    }
}
