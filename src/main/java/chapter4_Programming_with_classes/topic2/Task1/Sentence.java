package chapter4_Programming_with_classes.topic2.Task1;

public class Sentence {

    private String sentenses;

    public Sentence(String sentenses) {
        this.sentenses = sentenses;
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "sentenses='" + sentenses + '\'' +
                '}';
    }

    public String getSentenses() {
        return sentenses;
    }

    public void setSentenses(String sentenses) {
        this.sentenses = sentenses;
    }
}
