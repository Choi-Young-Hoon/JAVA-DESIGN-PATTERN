package designpattern.iterator.usingArrayList;

import designpattern.iterator.BookShelfIterator;

import java.util.Iterator;

public class BookShelfIteratorPatternArrayList {
    public static void run() {
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook(new Book("test1"));
        bookShelf.addBook(new Book("test2"));
        bookShelf.addBook(new Book("test3"));
        bookShelf.addBook(new Book("test4"));

        // Case 1
        Iterator<Book> iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.getName());
        }
        System.out.println();

        // Case 2
        for (Book book : bookShelf) {
            System.out.println(book.getName());
        }
        System.out.println();

    }
}
