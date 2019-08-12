package pl.slemjet.proxy.dynamic;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

class LoggingHandlerTest {
    @Test
    void test() {
        Person person = new Person();
        Human logged = withLogging(person, Human.class);
        logged.walk();
        logged.talk();
        logged.talk();

        System.out.println(logged);
    }

    @SuppressWarnings("unchecked")
    public static <T> T withLogging(T target, Class<T> itf) {
        return (T) Proxy.newProxyInstance(
                itf.getClassLoader(),
                new Class<?>[]{itf},
                new LoggingHandler(target));
    }
}