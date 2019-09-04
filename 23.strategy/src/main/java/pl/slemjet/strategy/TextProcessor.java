package pl.slemjet.strategy;

import java.util.List;
import java.util.function.Supplier;

// without Generic it is dynamic
public class TextProcessor<T extends ListStrategy> {
    private StringBuilder sb = new StringBuilder();

    private T listStrategy;

    public TextProcessor(Supplier<? extends T> ctor) {
        listStrategy = ctor.get();
    }

    // the skeleton algorithm is here
    public void appendList(List<String> items) {
        listStrategy.start(sb);
        items.stream().forEach(item -> listStrategy.addListItem(sb, item));
        listStrategy.end(sb);
    }

    public void clear() {
        sb.setLength(0);
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
