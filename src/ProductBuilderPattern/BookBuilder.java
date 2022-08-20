package ProductBuilderPattern;

public class BookBuilder {

    private String title;
    private String author;
    private int noOfPages;
    private String genre;
    private Book book;

    public BookBuilder(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public BookBuilder withNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
        return this;
    }

    public BookBuilder withGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public void build() {
        this.book = new Book(this.title, this.author, this.noOfPages, this.genre);
    }

    public Book getProduct() {
        return this.book;
    }

}
