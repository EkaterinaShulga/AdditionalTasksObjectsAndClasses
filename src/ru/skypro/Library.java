package ru.skypro;

public class Library {
    private Book[] books;
    Book book;
    private int m;

    public Library(int m) {
        this.books = new Book[m];
    }

    public Book[] fillArrayBooks(Book[] books, Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                System.out.println(books[i]);
                break;
            }
        }
        return books;
    }

    public void findTitleAndPrintNameBook(Book[] books, String nameBook) {
        for (int i = 0; i < books.length; i++)
            if (books[i].getNameBook().equals(nameBook)) {
                System.out.println(books[i].getNameBook() + " by " + books[i].getAuthor() + " was published in " + books[i].getYearPublication());
                System.out.println();
                break;
            }
    }

    public void findTitleBook(Book[] books, String nameBook, String newYearPublication) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getNameBook().equals(nameBook)) {
                System.out.println("При указании года издания книги  " + "\"" + books[i].getNameBook() + "\"" + ", " + " автором которой является "
                        + books[i].getAuthor() + " была допущена ошибка, верный год  издания:  " + books[i].setYearPublication(newYearPublication) + ".");
                break;
            }

        }
    }


}




