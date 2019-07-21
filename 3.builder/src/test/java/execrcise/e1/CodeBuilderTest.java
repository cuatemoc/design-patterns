package execrcise.e1;

import org.junit.jupiter.api.Test;

class CodeBuilderTest {

    @Test
    public void test1() {
        String foo = new CodeBuilder("Foo").toString();
        System.out.println(foo);
    }

    @Test
    public void test2() {
        String person = new CodeBuilder("Person")
                .addField("name", "String")
                .addField("age", "int")
                .toString();
        System.out.println(person);
    }

}