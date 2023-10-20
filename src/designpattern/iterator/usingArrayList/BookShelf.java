package designpattern.iterator.usingArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class BookShelf implements Iterable<Book> {
    private ArrayList<Book> bookList;

    public BookShelf() {
        this.bookList = new ArrayList<>();
    }

    public Book getAt(int index) {
        return this.bookList.get(index);
    }

    public int getLength() {
        return this.bookList.size();
    }

    public void addBook(Book book) {
        this.bookList.add(book);
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
