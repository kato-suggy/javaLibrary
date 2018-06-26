package test;

import org.junit.jupiter.api.Test;
import shelves.Book;
import shelves.Shelf;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ShelfTest {

    public Shelf testShelf = new Shelf();
    public Book testBook = new Book("some title", "some author", 1, 2000, "some publisher");
    public ArrayList<Book> books;

    public void addBook() {
        testShelf.addBook(testBook);
        books = testShelf.listAll();

    }

    @Test
    public void AddingABook() {

        addBook();

        assertEquals(Arrays.asList(testBook), books);


    }

    public void DeleteBook() {
        addBook();

        assertEquals(Arrays.asList(testBook), books);

        testShelf.deleteBook("some title", 1);
        assertTrue(books.isEmpty());
    }

}