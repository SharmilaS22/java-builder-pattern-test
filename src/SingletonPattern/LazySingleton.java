package SingletonPattern;

public class LazySingleton {

    private static LazySingleton instance;

//    add synchronised - when two access - at the same time - one by one
//    but only for the useCase - first time access - the method should be synchronised
//    dont have to synchronise for other cases - for that we can use Doubly checked singleton pattern
    public static synchronized LazySingleton getInstance() {
        if (instance == null)
            instance = new LazySingleton();
        return instance;
    }
}
