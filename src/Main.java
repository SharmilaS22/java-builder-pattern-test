import BuilderPattern.User;
import BuilderPattern.UserBuilder;
import ProductBuilderPattern.Book;
import ProductBuilderPattern.BookBuilder;
import SingletonPattern.EagerSingleton;
import SingletonPattern.LazySingleton;

public class Main {
    public static void main(String[] args) {

//        Builder
        User sharmi = new UserBuilder("Sharmi")
                .withAge(21)
                .withCity("Chennai")
                .build();
        System.out.println(sharmi.getCity());

//        Builder get product
        BookBuilder bookBuilder = new BookBuilder("Six Of Crows", "Leigh Bardugo")
                .withNoOfPages(302)
                .withGenre("Fantasy");
        bookBuilder.build();
        Book book = bookBuilder.getProduct();
        System.out.println(book.getGenre());

//        Singleton - Lazy version
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();

        System.out.println(lazySingleton1 == lazySingleton2);

//      Singleton - eager version
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();

        System.out.println(eagerSingleton1 == eagerSingleton2);

    }
}
