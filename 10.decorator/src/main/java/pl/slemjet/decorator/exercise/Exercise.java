package pl.slemjet.decorator.exercise;

public class Exercise {


    class Bird {
        public int age;

        public String fly() {
            return age < 10 ? "flying" : "too old";
        }
    }

    class Lizard {
        public int age;

        public String crawl() {
            return (age > 1) ? "crawling" : "too young";
        }
    }

    class Dragon {
        private Bird bird;
        private Lizard lizard;
        private int age;

        public Dragon() {
            bird = new Bird();
            lizard = new Lizard();
        }

        public void setAge(int age) {
            // todo
            this.age = age;
            bird.age = age;
            lizard.age = age;
        }

        public String fly() {
            // todo

            return bird.fly();
        }

        public String crawl() {
            // todo

            return lizard.crawl();
        }
    }

}
