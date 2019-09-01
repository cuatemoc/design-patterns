package pl.slemjet.observable.exercise;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;


class Game {
    public Event<Void> ratEnters = new Event<>();
    public Event<Void> ratDies = new Event<>();
    public Event<Rat> notifyRat = new Event<>();
}

class Event<T> {
    private List<BiConsumer<Object, T>> consumers = new ArrayList<>();

    public void subscribe(BiConsumer<Object, T> consumer) {
        consumers.add(consumer);
    }

    public void invoke(Object sender, T arg) {
        for (BiConsumer<Object, T> consumer : consumers)
            consumer.accept(sender, arg);
    }
}

class Rat implements Closeable {
    private Game game;
    public int attack = 1;

    public Rat(Game game) {
        this.game = game;

        // rat enters action
        game.ratEnters.subscribe((sender, value) -> {
            if (sender != this) {
                attack++;
                game.notifyRat.invoke(this, (Rat) sender);
            }
        });

        // notify rat action
        game.notifyRat.subscribe((o, rat) -> {
            if (rat == this)
                ++attack;
        });

        // rat leaves action
        game.ratDies.subscribe((sender, value) -> --attack);

        game.ratEnters.invoke(this, null);
    }

    @Override
    public void close() throws IOException {
        game.ratDies.invoke(this, null);
    }
}