package chapter4_Programming_with_classes.topic1.Task10;

import java.util.Date;

public class Airlane {
    private String finishPoint;
    private int numberOfAirlane;
    private String typeOfAirplane;
    private Date startTime;
    private String dayOfTheWeek;

    public String getFinishPoint() {
        return finishPoint;
    }

    public void setFinishPoint(String finishPoint) {
        this.finishPoint = finishPoint;
    }

    public int getNumberOfAirlane() {
        return numberOfAirlane;
    }

    public void setNumberOfAirlane(int numberOfAirlane) {
        this.numberOfAirlane = numberOfAirlane;
    }

    public String getTypeOfAirplane() {
        return typeOfAirplane;
    }

    public void setTypeOfAirplane(String typeOfAirplane) {
        this.typeOfAirplane = typeOfAirplane;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public void setDayOfTheWeek(String dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public Airlane(String finishPoint, int numberOfAirlane, String typeOfAirplane, Date startTime, String dayOfTheWeek) {
        this.finishPoint = finishPoint;
        this.numberOfAirlane = numberOfAirlane;
        this.typeOfAirplane = typeOfAirplane;
        this.startTime = startTime;
        this.dayOfTheWeek = dayOfTheWeek;
    }

    @Override
    public String toString() {
        return "Airlane{" +
                "finishPoint='" + finishPoint + '\'' +
                ", numberOfAirlane=" + numberOfAirlane +
                ", typeOfAirplane='" + typeOfAirplane + '\'' +
                ", startTime=" + startTime +
                ", dayOfTheWeek='" + dayOfTheWeek + '\'' +
                '}';
    }
}
