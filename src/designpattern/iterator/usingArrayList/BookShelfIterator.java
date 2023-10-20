package designpattern.iterator.usingArrayList;

import java.util.Iterator;

public class BookShelfIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (this.index >= this.bookShelf.getLength()) {
            return false;
        }
        return true;
    }

    @Override
    public Book next() {
        Book book = this.bookShelf.getAt(this.index++);
        return book;
    }
}
