package pl.slemjet.flyweight.names;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class User2Test {
    @Test
    void test() {
        User2 user = new User2("John Smith");
        User2 user1 = new User2("Jane Smith");

        Assertions.assertThat(user1).isNotNull();
    }
}