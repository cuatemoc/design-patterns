package pl.slemjet.singleton.basic;

import org.junit.jupiter.api.Test;
import pl.slemjet.singleton.utils.TestUtils;

import static org.junit.jupiter.api.Assertions.*;

class BasicSingletonTest {

    @Test
    public void test() throws Exception {
        BasicSingleton singleton = BasicSingleton.getInstance();
        singleton.setValue(111);

        String filename = "singleton.bin";
        TestUtils.saveToFile(singleton, filename);

        singleton.setValue(222);

        BasicSingleton singleton2 = (BasicSingleton) TestUtils.readFromFile(filename);

        assertNotEquals(singleton, singleton2);

        System.out.println(singleton.getValue());
        System.out.println(singleton2.getValue());
    }
}