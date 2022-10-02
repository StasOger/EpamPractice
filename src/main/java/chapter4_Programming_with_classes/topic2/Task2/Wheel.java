package chapter4_Programming_with_classes.topic2.Task2;

public class Wheel {
    private int radiusOfWheel;
    private boolean brokenOrNot;

    public int getRadiusOfWheel() {
        return radiusOfWheel;
    }

    public void setRadiusOfWheel(int radiusOfWheel) {
        this.radiusOfWheel = radiusOfWheel;
    }

    public boolean isBrokenOrNot() {
        return brokenOrNot;
    }

    public void setBrokenOrNot(boolean brokenOrNot) {
        this.brokenOrNot = brokenOrNot;
    }

    public Wheel(int radiusOfWheel, boolean brokenOrNot) {
        this.radiusOfWheel = radiusOfWheel;
        this.brokenOrNot = brokenOrNot;
    }
}
