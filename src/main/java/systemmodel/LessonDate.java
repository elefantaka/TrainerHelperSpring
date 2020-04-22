package systemmodel;

import java.io.Serializable;

public class LessonDate implements Serializable {

    private int year;
    private int month;
    private int day;
    private int hour;

    public LessonDate(int year, int month, int day, int hour) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "LessonDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", hour=" + hour +
                '}';
    }
}
