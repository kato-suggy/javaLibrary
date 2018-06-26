package shelves;

import java.util.ArrayList;
import java.util.HashMap;

public class Shelf {

    private HashMap<String, Hashmap<Integer, ArrayList<Book>>> books;

    public Shelf() {
        this.books = new HashMap<String, Hashmap<Integer, ArrayList<Book>>>();
    }

    public void addBook(Book book) {
        String title = book.getTitle();
        int edition = book.getEdition();


        books.put(title, HashMap<edition, book);

    }

    public void deleteBook(String title, int edition) {

    }

    public HashMap<String, Hashmap<Integer, ArrayList<Book>>> listAll() {
        return books;
    }
}
