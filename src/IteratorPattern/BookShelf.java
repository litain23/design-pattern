package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate{
    private List<Book> books;

    public BookShelf() {
        books = new ArrayList<>();
    }

    public Book getBookAt(int i) {
        return books.get(i);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
