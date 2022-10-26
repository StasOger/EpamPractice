package chapter5_BasicsOfOOP.Task3;

public class Calendar {
    private String day;
    private String month;
    private String year;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Calendar(String day, String month, String year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}
