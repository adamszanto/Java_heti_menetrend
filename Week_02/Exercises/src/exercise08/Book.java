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
}
