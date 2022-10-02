package chapter4_Programming_with_classes.topic2.Task1;

import java.util.ArrayList;

public class Text {
    private Word heading;
    private ArrayList<Sentence> content;

    public Text(Word heading, ArrayList<Sentence> content) {
        this.heading = heading;
        this.content = content;
    }

    Text(Word heading, Sentence sentence){
        this.heading = heading;
        this.content = new ArrayList<>();
        this.content.add(sentence);
    }

    void completeTheText (Sentence sentence) {
        this.content.add(sentence);
    }

    void printText() {
        for (Sentence sentence : this.content) {
            System.out.print(sentence);
        }
    }

    void printHeading() {
        System.out.println(heading);
    }

    public Word getHeading() {
        return heading;
    }

    public void setHeading(Word heading) {
        this.heading = heading;
    }

    public ArrayList<Sentence> getContent() {
        return content;
    }

    public void setContent(ArrayList<Sentence> content) {
        this.content = content;
    }
}
