package exercise08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Library {
    private final List<Book> books;

    public Library(List<Book> books) {
        this.books = new ArrayList<>(books);
    }

    public List<Book> getBooks() {
        // TODO: Listat visszaadni "veszelyes", ezert kezelni kell:
        // Kapunk egy olyan listat, ami immutable, ezt biztonsagosan oda tudjuk adni a kulvilagnak
        return Collections.unmodifiableList(books);
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
