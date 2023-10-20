package designpattern.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

// Iterator<T> 처리를 반복하는 반복자를 나타내는 인터페이스
// hasNext(), next() Override

public class BookShelfIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (this.index < bookShelf.getLength()) {
            return true;
        }
        return false;
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Book book = this.bookShelf.getBookAt(this.index);
        this.index++;
        return book;
    }
}
