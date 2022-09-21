package chapter4_Programming_with_classes.Task6;

public class DateTime {
    private int hours;

    private int minutes;

    private int seconds;

    public int getHours() {
        if (hours > 24 || minutes < 0)
            hours = 0;
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        if (minutes > 60 || minutes < 0)
            minutes = 0;
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        if (seconds > 60 || seconds < 0)
            seconds = 0;
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public DateTime(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return "DateTime{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }
}
