import java.util.List;

public class BookView {
    public void displayBookShop(List<Book> books) {
        System.out.println("Книги в магазинчике: ");

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.println(i + "." + " Автор книги " + book.getTitle() + " "
                    + book.getAuthor());
        }
        System.out.println();
    }

    public void displayBook(Book book) {
        if (book != null) {
            System.out.println("Автор книги " + book.getTitle() + " " + book.getAuthor() );
        } else {
            System.out.println("Книга не найдена");
        }
        System.out.println();
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
