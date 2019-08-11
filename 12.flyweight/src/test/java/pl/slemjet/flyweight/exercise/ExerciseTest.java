package pl.slemjet.flyweight.exercise;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ExerciseTest {
    @Test
    void test() {
        Exercise.Sentence sentence = new Exercise.Sentence("hello world");
        sentence.getWord(1).capitalize = true;
        System.out.println(sentence);
        Assertions.assertThat(sentence.toString()).isEqualTo("hello WORLD");
    }
}