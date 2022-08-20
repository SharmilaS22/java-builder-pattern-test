package SingletonPattern;

public class DoublySingleton {
//    doubly checked
//    double locked
    private static DoublySingleton instance;

    public static DoublySingleton getInstance() {
        if (instance == null) { // only in this case, the accesses should be synchronized
            synchronized (DoublySingleton.class) {
                if (instance == null) {
                    instance = new DoublySingleton();
                }
            }
        }
        return instance;
    }
}
