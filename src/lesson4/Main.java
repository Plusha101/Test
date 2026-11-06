package lesson4;

public class Main {
    public static void main(String[] args) {
        Library library = new Library("Читай-город", 10);

        Book b1 = new Book("Мастер и Маргарита", "Булгаков М.", 1967, 5);
        Book b2 = new Book("1984", "Оруэлл Дж.", 1949, 4);
        Book b3 = new Book("Преступление и наказание", "Достоевский Ф.", 1866, 5);
        Book b4 = new Book("Война и мир", "Толстой Л.", 1869, 3);
        Book b5 = new Book("Анна Каренина", "Толстой Л.", 1877, 4);

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
        library.addBook(b4);
        library.addBook(b5);

        b1.borrow();
        b2.borrow();
        b3.borrow();

        b1.returnBook();

        System.out.println(" Доступные книги ");
        library.printAvailable();

        System.out.println(" Поиск: 'толстой л.' ");
        library.findByAuthor("толстой л.");

        System.out.println(" Статистика ");
        library.getStats();

        System.out.println(" Лучшая книга по рейтингу ");
        Book bestBook = library.getBestBook();
        if (bestBook != null) {
            System.out.println(bestBook.getInfo());
        } else {
            System.out.println("В библиотеке нет книг.");
        }
        System.out.println("Привет!");
    }
}