package pl.slemjet.singleton.enumbased;

import org.junit.jupiter.api.Test;
import pl.slemjet.singleton.utils.TestUtils;

import static org.junit.jupiter.api.Assertions.*;

class EnumSingletonTest {

    @Test
    public void test() throws Exception {
        String filename = "enumSingleton.bin";

//        Serialized with 100
//        EnumSingleton instance = EnumSingleton.INSTANCE;
//        instance.setValue(100);
//        TestUtils.saveToFile(instance, filename);

        EnumSingleton instance2 = (EnumSingleton) TestUtils.readFromFile(filename);
        assertNotEquals(instance2.getValue(), 100);
    }

}