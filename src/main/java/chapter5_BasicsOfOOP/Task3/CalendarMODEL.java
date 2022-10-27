package chapter5_BasicsOfOOP.Task3;

public class CalendarMODEL {
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public CalendarMODEL(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public CalendarMODEL(int day, int month) {
        this.day = day;
        this.month = month;
    }

    @Override
    public String toString() {
        return "CalendarMODEL{" +
                "day=" + day +
                ", month=" + month +
                '}';
    }
}
