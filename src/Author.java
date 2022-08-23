import java.util.Objects;

public class Author {
    private final String name;
    private final String lastname;

    public Author(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String toString() {
        return "Автор: " + name + " " + lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(lastname, author.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname);
    }
}
