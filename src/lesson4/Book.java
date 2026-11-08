package lesson4;

public class Book {
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;
    private int rating;

    public Book(String title, String author, int year, int rating) {
        setTitle(title);
        setAuthor(author);
        this.year = year;
        setRating(rating);
        this.isAvailable = true;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }
    public boolean isAvailable() { return isAvailable; }
    public int getRating() { return rating; }

    public void setTitle(String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        }
    }

    public void setAuthor(String author) {
        if (author != null && !author.isEmpty()) {
            this.author = author;
        }
    }

    public void setRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            this.rating = rating;
        } else {
        }
    }

    public boolean borrow() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    public void returnBook() {
        isAvailable = true;
    }

    public String getInfo() {
        String status = isAvailable ? "[Доступна]" : "[Выдана]";
        return '"' + title + '"' + " - " + author + " (" + year + ") [рейтинг: " + rating + "] " + status;
    }
}
