package pl.slemjet.flyweight.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise {


    static class Sentence {
        static List<String> strings = new ArrayList<>();
        private int[] indices;
        private List<WordToken> wordTokens = new ArrayList<>();

        public Sentence(String plainText) {
            indices = Arrays.stream(plainText.split(" "))
                    .mapToInt(word -> getOrAdd(word))
                    .toArray();
        }

        private int getOrAdd(String word) {
            if (strings.contains(word)) {
                return strings.indexOf(word);
            } else {
                strings.add(word);
                return strings.size() - 1;
            }
        }

        public WordToken getWord(int index) {
            WordToken wordToken = new WordToken(index);
            this.wordTokens.add(wordToken);
            return wordToken;

        }

        @Override
        public String toString() {

            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < indices.length; i++) {
                String word = strings.get(i);
                for (WordToken token : wordTokens) {
                    if (token.index == i) {
                        word = word.toUpperCase();
                    }
                }
                stringBuilder.append(word);
                if(i < indices.length - 1){
                    stringBuilder.append(" ");
                }
            }
            return stringBuilder.toString();
        }

        class WordToken {
            private final int index;
            public boolean capitalize;

            WordToken(int index) {
                this.index = index;
            }
        }
    }


}
