package chapter4_Programming_with_classes.Task5;

class Count {
    private int min,max,current;

    public Count(int min_, int max_, int current_){
        min = min_;
        max = max_;
        current = current_;

        if (max < min) {
            int tmp = max;
            max = min;
            min = tmp;
        }

        if (current < min)
            current = min;
        if (current > max)
            current = max;
    }

    public Count(int min_, int max_) {
        this(min_, max_, min_);
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
