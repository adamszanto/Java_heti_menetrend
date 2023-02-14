package exercise08;

import java.util.ArrayList;
import java.util.List;

public final class Library {
    private final List<Book> books;

    public Library(List<Book> books) {
        this.books = new ArrayList<>(books);
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book get(int num) {
        return books.get(num);
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }
}
