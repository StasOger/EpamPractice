package chapter4_Programming_with_classes.Task4;

import java.util.Date;

public class Train{

    private long numberOfTrain;

    private String finishPoint;

    private Date st;

    public Train(long numberOfTrain, String finishPoint, Date st) {
        this.numberOfTrain = numberOfTrain;
        this.finishPoint = finishPoint;
        this.st = st;
    }

    public long getNumberOfTrain() {
        return numberOfTrain;
    }

    public void setNumberOfTrain(long numberOfTrain) {
        this.numberOfTrain = numberOfTrain;
    }

    public String getFinishPoint() {
        return finishPoint;
    }

    public void setFinishPoint(String finishPoint) {
        this.finishPoint = finishPoint;
    }

    public Date getSt() {
        return st;
    }

    public void setSt(Date st) {
        this.st = st;
    }

    @Override
    public String toString() {
        return "Train{" +
                "numberOfTrain=" + numberOfTrain +
                ", finishPoint='" + finishPoint + '\'' +
                ", st=" + st +
                '}';
    }
}