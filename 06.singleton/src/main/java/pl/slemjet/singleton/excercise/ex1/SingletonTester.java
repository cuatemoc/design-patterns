package pl.slemjet.singleton.excercise.ex1;

import java.util.function.Supplier;

public class SingletonTester {

    public static boolean isSingleton(Supplier<Object> func) {
        Object first = func.get();
        Object second = func.get();
        return first == second;
    }
}