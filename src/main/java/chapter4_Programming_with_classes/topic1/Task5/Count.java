package chapter4_Programming_with_classes.Task5;

public class Count {

    private int max;
    private int min;
    private int current;

    public Count(int min, int max, int current){
        this.min = min;
        this.max = max;
        this.current = current;

        if (max < min) {
            this.max = min;
            this.min = max;
        }

        if (current < min)
            this.current = min;
        if (current > max)
            this.current = max;
    }

    public Count(int min, int max) {
        this(min, max, min);
        current = min;
    }

    public Count() {
        this(0, 16, 0);
    }

    public void increment(){
        current++;
        if (current > max)
            current = min;
    }

    public void decrement(){
        current--;
        if (current < min)
            current = max;
    }

    public int value() {
        return current;
    }
}
