package database;

import systemmodel.KindOfLesson;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class GroupLessonData {

    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrement
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private EmployeeData employeeData;

    @Enumerated(EnumType.STRING)
    private KindOfLesson kindOfLesson;

    private String hour;
    private Date date;
    private int maxGroupSize;

    public GroupLessonData(EmployeeData employeeData, KindOfLesson kindOfLesson, Date date, String hour, int maxGroupSize) {

        this.employeeData = employeeData;
        this.kindOfLesson = kindOfLesson;
        this.date = date;
        this.hour = hour;
        this.maxGroupSize = maxGroupSize;
    }

    public GroupLessonData() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EmployeeData getEmployeeData() {
        return employeeData;
    }

    public void setEmployeeData(EmployeeData employeeData) {
        this.employeeData = employeeData;
    }

    public KindOfLesson getKindOfLesson() {
        return kindOfLesson;
    }

    public void setKindOfLesson(KindOfLesson kindOfLesson) {
        this.kindOfLesson = kindOfLesson;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public int getMaxGroupSize() {
        return maxGroupSize;
    }

    public void setMaxGroupSize(int maxGroupSize) {
        this.maxGroupSize = maxGroupSize;
    }

    @Override
    public java.lang.String toString() {
        return "GroupLessonData{" +
                "id=" + id +
                ", employeeData=" + employeeData +
                ", kindOfLesson=" + kindOfLesson +
                ", Date=" + date +
                ", lessonDate=" + hour +
                ", maxGroupSize=" + maxGroupSize +
                '}';
    }
}
