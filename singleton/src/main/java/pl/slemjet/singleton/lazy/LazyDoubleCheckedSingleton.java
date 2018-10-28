package pl.slemjet.singleton.lazy;

public class LazyDoubleCheckedSingleton {

    private static LazyDoubleCheckedSingleton instance;

    private LazyDoubleCheckedSingleton(){};

    public static LazyDoubleCheckedSingleton getInstance(){
        if(instance == null){
            // Lock and check again
            synchronized (LazyDoubleCheckedSingleton.class){
                if(instance == null){
                    instance = new LazyDoubleCheckedSingleton();
                }
            }
        }
        return instance;
    }
}
