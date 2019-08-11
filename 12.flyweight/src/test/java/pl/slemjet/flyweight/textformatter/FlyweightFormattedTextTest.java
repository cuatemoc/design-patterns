package pl.slemjet.flyweight.textformatter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FlyweightFormattedTextTest {
    @Test
    void test() {
        FormattedText ft = new FormattedText("This is a brave new world");
        ft.capitalize(10, 15);
        System.out.println(ft);
        Assertions.assertThat(ft.toString()).contains("BRAVE");

        FlyweightFormattedText bft = new FlyweightFormattedText("Make America Great Again");
        bft.getRange(13, 18).capitalize = true;
        System.out.println(bft);
        Assertions.assertThat(bft.toString()).contains("GREAT");
    }
}