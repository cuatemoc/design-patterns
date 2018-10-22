package pl.slemjet.prototype.serialization;

import org.apache.commons.lang3.SerializationUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class FooTest {

    @Test
    public void testCopy(){

        Foo foo = new Foo(42, "life");
        // use apache commons!
        Foo foo2 = SerializationUtils.roundtrip(foo);

        foo2.whatever = "xyz";

        System.out.println(foo);
        System.out.println(foo2);

        assertNotEquals(foo, foo2);
    }
}