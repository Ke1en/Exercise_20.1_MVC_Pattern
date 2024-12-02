import java.util.ArrayList;
import java.util.List;

public class BookModel {
    private final List<Book> books = new ArrayList<>();

    public void addBook(String author, String title) {
        books.add(new Book(author, title));
    }

    public void removeBook(int index) {
        if (index >= 0 && index < books.size()) {
            books.remove(index);
        } else {
            throw new IllegalArgumentException("Неверный индекс задачи");
        }
    }

    public Book getBookByTitle(String title) {
        for (Book books: books) {
            if (books.getTitle().equals(title)) {
                return books;
            }
        }
        return null;
    }

    public List<Book> getBooks() {
        return books;
    }
}
