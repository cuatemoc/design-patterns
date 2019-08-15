package pl.slemjet.chainofresponsibility.exercise;

import java.util.*;
import java.util.function.Consumer;

public class Exercise {

    public static List<String> goblinNames = Arrays.asList("goblin", "goblin names");

    static abstract class Creature {
        public Game game;
        public String name;
        public int baseAttack;
        public int baseDefence;


        public abstract int getAttack();

        public abstract int getDefense();

        @Override
        public String toString() {
            return "Creature{" +
                    "name='" + name + '\'' +
                    ", baseAttack=" + getAttack() +
                    ", baseDefence=" + getDefense() +
                    '}';
        }
    }

    static class Goblin extends Creature {
        public Goblin(Game game) {
            this.game = game;
            this.name = "goblin";
            this.baseAttack = 1;
            this.baseDefence = 1;

            new GoblinPresentCreatureModifier(game, this);
        }

        @Override
        public int getAttack() {
            Query query = new Query(this.name, Query.Statistic.ATTACK, baseAttack);
            game.queries.fire(query);
            return query.result;
        }

        @Override
        public int getDefense() {
            Query query = new Query(this.name, Query.Statistic.DEFENSE, baseDefence);
            game.queries.fire(query);
            return query.result - 1;
        }
    }

    static class GoblinKing extends Goblin {
        public GoblinKing(Game game) {
            super(game);
            this.name = "goblin king";
            this.baseAttack = 3;
            this.baseDefence = 3;

            new GoblinKingPresentCreatureModifier(game, this);
        }
    }


    static class GoblinPresentCreatureModifier extends CreatureModifier {

        public GoblinPresentCreatureModifier(Game game, Creature creature) {
            super(game, creature);

            game.queries.subscribe(q -> {
                if (goblinNames.contains(q.name)
                        && q.statistic == Query.Statistic.DEFENSE) {
                    q.result += 1;
                }
            });
        }
    }

    static class GoblinKingPresentCreatureModifier extends CreatureModifier {

        public GoblinKingPresentCreatureModifier(Game game, Creature creature) {
            super(game, creature);

            game.queries.subscribe(q -> {
                if (goblinNames.contains(q.name)
                        && q.statistic == Query.Statistic.ATTACK) {
                    q.result += 1;
                }
            });
        }
    }

    static class CreatureModifier {
        protected Game game;
        protected Creature creature;

        public CreatureModifier(Game game, Creature creature) {
            this.game = game;
            this.creature = creature;
        }
    }


    static class Game {
        public List<Creature> creatures = new ArrayList<>();
        public Event<Query> queries = new Event<>();
    }

    static class Query {
        enum Statistic {
            ATTACK, DEFENSE
        }

        public Statistic statistic;
        public int result;
        public String name;

        public Query(String name, Statistic statistic, int result) {
            this.statistic = statistic;
            this.result = result;
            this.name = name;
        }
    }

    static class Event<T> {
        private int index;

        private Map<Integer, Consumer> handlers = new HashMap<>();

        public int subscribe(Consumer<T> handler) {
            int i = index;
            handlers.put(index++, handler);
            return i;
        }

        public void unsubscribe(int key) {
            handlers.remove(key);
        }

        public void fire(T args) {
            for (Consumer consumer : handlers.values()) {
                consumer.accept(args);
            }
        }
    }
}
