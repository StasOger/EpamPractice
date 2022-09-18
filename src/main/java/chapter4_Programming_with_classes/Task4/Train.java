package chapter4_Programming_with_classes.Task4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Train implements Comparable<Train> {

    private long numberOfTrain;

    private static String finishPoint;

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

    public static String getFinishPoint() {
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

    @Override
    public int compareTo(Train o) {

//        if (){
            return (int) (this.getNumberOfTrain() - o.getNumberOfTrain());
//        } else {
//            return getFinishPoint().compareTo(Train.getFinishPoint());
//        }
    }



}