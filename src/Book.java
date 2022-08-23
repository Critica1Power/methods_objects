import java.util.Objects;

public class Book {

    private final String title;
    private int publishDate;
    private final Author author;

    public Book(String title, int publishDate, Author author) {
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public Author getAuthor() {
        return author;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }

    public String toString() {
        return "Книга: " + title + ", Дата публикации: " + publishDate + ", " + author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishDate == book.publishDate && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
