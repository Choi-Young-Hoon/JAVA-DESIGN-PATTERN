package designpattern.iterator;

import java.util.Iterator;

// Iterable<T> - 집합체를 나타내는 인터페이스
// iterator() 구현 - 반복자 Iterator class 를 반환하는 함수

public class BookShelf implements Iterable<Book> {
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[this.last] = book;
        this.last++;
    }

    public int getLength() {
        return this.last;
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
