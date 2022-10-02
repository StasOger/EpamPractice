package chapter4_Programming_with_classes.topic1.Task9;

import java.util.List;

public class BrunchBook {

    private int id;
    private List<Book> books;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public BrunchBook(int id, List<Book> books) {
        this.id = id;
        this.books = books;
    }
}
