package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book java = new Book("Java 8.0", 289);
        Book react = new Book("React JS", 165);
        Book python = new Book("Python for Dummies", 246);
        Book cleanCode = new Book("Clean code", 356);
        Book[] books = new Book[4];
        books[0] = java;
        books[1] = react;
        books[2] = python;
        books[3] = cleanCode;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getPages() + " pages.");
        }
        System.out.println("Replace [0] to [3].");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getPages() + " pages.");
        }
        System.out.println("Shown only books.name == Clean code");
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if ("Clean code".equals(books[i].getName())) {
                System.out.println(book.getName() + " - " + book.getPages() + " pages.");
            }
        }
    }
}