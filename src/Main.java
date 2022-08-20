import ProductBuilderPattern.Book;
import ProductBuilderPattern.BookBuilder;

public class Main {
    public static void main(String[] args) {
        User sharmi = new UserBuilder("Sharmi")
                .withAge(21)
                .withCity("Chennai")
                .build();
        System.out.println(sharmi.getCity());

        BookBuilder bookBuilder = new BookBuilder("Six Of Crows", "Leigh Bardugo")
                .withNoOfPages(302)
                .withGenre("Fantasy");
        bookBuilder.build();
        Book book = bookBuilder.getProduct();
        System.out.println(book.getGenre());

    }
}
