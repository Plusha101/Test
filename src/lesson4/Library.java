package lesson4;

public class Library {
    private String name;
    private Book books[];
    private int bookCount;

    public Library(String name, int maxBooks) {
        this.name = name;
        this.books = new Book[maxBooks];
        this.bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("Библиотека полна! Нельзя добавить книгу: " + book.getInfo());
        }
    }

    public void findByAuthor(String author) {
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getAuthor().equalsIgnoreCase(author)) {
                System.out.println(books[i].getInfo());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Книг автора '" + author + "' не найдено.");
        }
    }

    public void printAvailable() {
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                System.out.println(books[i].getInfo());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Нет доступных книг.");
        }
    }

    public void getStats() {
        int availableCount = 0;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                availableCount++;
            }
        }
        int borrowedCount = bookCount - availableCount;

        System.out.printf("Библиотека ", name);
        System.out.printf("Всего книг: ", bookCount);
        System.out.printf("Доступно: ", availableCount);
        System.out.printf("Выдано: ", borrowedCount);
    }

    public Book getBestBook() {
        if (bookCount == 0) {
            return null;
        }

        Book best = books[0];
        for (int i = 1; i < bookCount; i++) {
            Book current = books[i];
            if (current.getRating() > best.getRating()) {
                best = current;
            }
        }
        return best;
    }
}
