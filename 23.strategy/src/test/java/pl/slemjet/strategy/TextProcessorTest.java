package pl.slemjet.strategy;

import org.junit.jupiter.api.Test;
import pl.slemjet.strategy.HtmlListStrategy;
import pl.slemjet.strategy.MarkdownListStrategy;
import pl.slemjet.strategy.TextProcessor;

import java.util.List;

class TextProcessorTest {
    @Test
    void test() {
        TextProcessor<MarkdownListStrategy> tp = new TextProcessor<>(MarkdownListStrategy::new);
        tp.appendList(List.of("liberte", "egalite", "fraternite"));
        System.out.println(tp);

        TextProcessor<HtmlListStrategy> tp2 = new TextProcessor<>(HtmlListStrategy::new);
        tp2.appendList(List.of("inheritance", "encapsulation", "polymorphism"));
        System.out.println(tp2);
    }
}