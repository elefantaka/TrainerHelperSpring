package systemmodel;

import java.io.Serializable;

public class SportLesson implements Serializable {

    protected int id;
    protected Employee employee;
    protected KindOfLesson lesson;
    protected String date;

    public SportLesson(int id, Employee employee, KindOfLesson lesson, String date) {
        this.id = id;
        this.employee = employee;
        this.lesson = lesson;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public KindOfLesson getLesson() {
        return lesson;
    }

    public void setLesson(KindOfLesson lesson) {
        this.lesson = lesson;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public java.lang.String toString() {
        return "SportLesson{" +
                "id=" + id +
                ", employee=" + employee +
                ", lesson=" + lesson +
                ", date=" + date +
                '}';
    }
}
