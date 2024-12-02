/*
Приложение "Управление магазином книг".

Приложение позволяет:
        1. Добавлять книги в магазин.
        2. Удалять книги из магазина.
        3. Показывать список всех книг.
        4. Искать книгу по названию.
MVC
Model: хранит данные о книгах и управляет ими.
View: отображает список книг и результаты операций.
Controller: принимает команды от пользователя через Scanner и управляет моделью и вьюшкой
*/

public class Main {
    public static void main(String[] args) {
        BookModel model = new BookModel();
        BookView view = new BookView();
        BookController controller = new BookController(model, view);

        controller.start();
    }
}