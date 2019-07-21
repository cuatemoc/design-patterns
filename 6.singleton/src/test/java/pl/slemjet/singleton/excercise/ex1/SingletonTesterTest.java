package pl.slemjet.singleton.excercise.ex1;

import org.junit.jupiter.api.Test;
import pl.slemjet.singleton.basic.BasicSingleton;
import pl.slemjet.singleton.enumbased.EnumSingleton;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTesterTest {

    @Test
    void isSingleton() {
        boolean singleton = SingletonTester.isSingleton(() -> BasicSingleton.getInstance());
        assertTrue(singleton);
    }

    @Test
    void isSingletonEnum() {
        boolean singleton = SingletonTester.isSingleton(() -> EnumSingleton.INSTANCE);
        assertTrue(singleton);
    }
}