package ProductBuilderPattern;

public class Book {
    private String title;
    private String author;
    private int noOfPages;
    private String genre;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, int noOfPages, String genre) {
        this.title = title;
        this.author = author;
        this.noOfPages = noOfPages;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public String getGenre() {
        return genre;
    }
}
