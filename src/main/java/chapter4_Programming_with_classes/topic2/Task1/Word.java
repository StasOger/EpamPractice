package chapter4_Programming_with_classes.topic2.Task1;

public class Word {
    private String word;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                '}';
    }

    public Word(String word) {
        this.word = word;
    }
}
