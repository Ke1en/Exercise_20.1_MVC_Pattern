import java.util.Scanner;

public class BookController {
    private final BookModel model;
    private final BookView view;

    public BookController(BookModel model, BookView view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            view.displayBookShop(model.getBooks());
            System.out.println("Команды ADD, REMOVE, FIND, EXIT");
            System.out.print("Введите команду: ");
            String command = scanner.nextLine();

            try {
                switch (command.toLowerCase()) {
                    case "add":
                        System.out.println("Введите автора и название книги {author title}");
                        String author = scanner.nextLine();
                        String title = scanner.nextLine();
                        model.addBook(author, title);
                        view.displayMessage("Книга добавлена");
                        break;
                    case "remove":
                        System.out.println("Введите индекс книги для удаления");
                        int removeIndex = Integer.parseInt(scanner.nextLine());
                        model.removeBook(removeIndex);
                        view.displayMessage("Книга удалена");
                        break;
                    case "find":
                        System.out.println("Введите название книги для поиска");
                        String findByTitle = scanner.nextLine();
                        view.displayBook(model.getBookByTitle(findByTitle));
                        view.displayMessage("Поиск книги завершен");
                        break;
                    case "exit":
                        view.displayMessage("Программа завершена");
                        return;
                    default:
                        view.displayMessage("Неизвестная команда");
                }
            } catch (Exception e) {
                view.displayMessage("Ошибка " + e.getMessage());
            }
        }
    }
}
