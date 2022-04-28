package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Library library = new Library(5);
        Book[] book = new Book[5];
        Book book1 = new Book("Stephen King", "The Stand", "1978");
        library.fillArrayBooks(book, book1);
        Book book2 = new Book("Александр Сергеевич Пушкин", "Евгений Онегин", "1831");
        library.fillArrayBooks(book, book2);
        Book book3 = new Book("Александр Сергеевич Пушкин", "Сказка о рыбаке и рыбке", "1833");
        library.fillArrayBooks(book, book3);
        Book book4 = new Book("Александр Сергеевич Пушкин", "Сказка о царе Салтане", "1831");
        library.fillArrayBooks(book, book4);
        Book book5 = new Book("Дмитрий Глуховский", "Метро", "2025");
        library.fillArrayBooks(book, book5);
        Book book6 = new Book("Дмитрий Глуховский2", "Метро", "2021");
        library.fillArrayBooks(book, book6);
        System.out.println();

        library.findTitleAndPrintNameBook(book, "The Stand");
        library.findTitleBook(book, "Метро", "2020");
    }

}

class Book {
    private String author;
    private String nameBook;
    private String yearPublication;

    public Book(String author, String nameBook, String yearPublication) {
        this.author = author;
        this.nameBook = nameBook;
        this.yearPublication = yearPublication;

    }

    public String getAuthor() {
        return author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public String getYearPublication() {
        return yearPublication;
    }

    public void setAuthor(String author) {
        this.author = author;

    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;

    }

    public String setYearPublication(String yearPublication) {
        this.yearPublication = this.yearPublication;
        return yearPublication;
    }

    @Override
    public String toString() {
        return nameBook + ": " + author + ": " + yearPublication;

    }
}




