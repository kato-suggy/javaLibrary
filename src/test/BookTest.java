package test;

import org.junit.jupiter.api.Test;
import shelves.Book;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    public Book testBook = new Book("some title", "some author", 1, 2000, "some publisher");
    @Test
    public void TestGetters() {
        assertEquals(testBook.getTitle(), "some title");
        assertEquals(testBook.getAuthor(), "some author");
        assertEquals(testBook.getEdition(), 1);
        assertEquals(testBook.getYear(), 2000);
        assertEquals(testBook.getPublisher(), "some publisher");
    }

}