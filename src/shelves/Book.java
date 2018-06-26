package shelves;

public class Book {

    private String title;
    private String author;
    private int edition;
    private int year;
    private String publisher;


    public Book(String title, String author, int edition, int year, String publisher) {

        this.title = title;
        this.author = author;
        this.edition = edition;
        this.year = year;
        this.publisher = publisher;

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getEdition() {
        return edition;
    }

    public int getYear() {
        return year;
    }

    public String getPublisher() {
        return publisher;
    }






}
