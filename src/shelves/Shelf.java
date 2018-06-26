package shelves;

import java.util.ArrayList;

public class Shelf {

    private ArrayList<Book> books;

    public Shelf() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);

    }

    public void deleteBook(String title, int edition) {

    }

    public ArrayList<Book> listAll() {
        return books;
    }
}
