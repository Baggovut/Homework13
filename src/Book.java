import java.util.Objects;

public class Book {
    private int releaseYear;
    private final String title;
    private final Author author;

    public Book(Author author, String title, int releaseYear){
        this.releaseYear = releaseYear;
        this.author = author;
        this.title = title;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Author getAuthor() {
        return this.author;
    }

    public String getAuthorFirstName(){
        return this.author.getFirstName();
    }

    public String getAuthorLastName(){
        return this.author.getLastName();
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Название книги = '" + title + '\'' +
                ", Автор книги = "+ author.getLastName()+ " " + author.getFirstName() + '\'' +
                ", Год издания книги = " + releaseYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return releaseYear == book.releaseYear && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(releaseYear, title, author);
    }
}
