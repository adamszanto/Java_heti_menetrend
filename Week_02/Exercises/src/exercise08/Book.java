package exercise08;

public final class Book {
    private final String author;
    private final String title;
    private final int yearOfPublish;

    public Book(String author, String title, int yearOfPublish) {
        this.author = author;
        this.title = title;
        this.yearOfPublish = yearOfPublish;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    // TODO: Equals, hashcode, tostring
    // TODO: Immutable checklist: final kulcsszo, nincsenek setterek, final valtozok, csekkolni hogy konstruktor parameterben van-e mutable...
    //  + a getterek deep copyt allitsanak elo a mutable belso allapotbol.
}
