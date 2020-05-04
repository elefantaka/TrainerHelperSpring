package database;

import systemmodel.Employee;
import systemmodel.Client;
import systemmodel.KindOfLesson;
import systemmodel.LessonDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;

@Entity
@Inheritance
public abstract class SportLessonData {

    @Id
    protected Long id;

    protected Employee employee;
    protected KindOfLesson kindOfLesson;
    protected LessonDate date;

    public SportLessonData(Employee employee, KindOfLesson kindOfLesson, LessonDate date) {
        this.employee = employee;
        this.kindOfLesson = kindOfLesson;
        this.date = date;
    }

    public SportLessonData() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public KindOfLesson getKindOfLesson() {
        return kindOfLesson;
    }

    public void setKindOfLesson(KindOfLesson kindOfLesson) {
        this.kindOfLesson = kindOfLesson;
    }

    public LessonDate getDate() {
        return date;
    }

    public void setDate(LessonDate date) {
        this.date = date;
    }
}

@Entity
class GroupLessonData extends SportLessonData{

    private int maxGroupSize;
    private int currentGroupSize;
    private Client client; //wczesniej bylo Client[]

    public GroupLessonData(Employee employee, KindOfLesson kindOfLesson, LessonDate date, int maxGroupSize, int currentGroupSize, Client client) {
        super(employee, kindOfLesson, date);
        this.maxGroupSize = maxGroupSize;
        this.currentGroupSize = currentGroupSize;
        this.client = client;
    }

    public GroupLessonData() {
    }

    public int getMaxGroupSize() {
        return maxGroupSize;
    }

    public void setMaxGroupSize(int maxGroupSize) {
        this.maxGroupSize = maxGroupSize;
    }

    public int getCurrentGroupSize() {
        return currentGroupSize;
    }

    public void setCurrentGroupSize(int currentGroupSize) {
        this.currentGroupSize = currentGroupSize;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}

@Entity
class IndividaulLessonData extends SportLessonData{

    private Client client;

    public IndividaulLessonData(Employee employee, KindOfLesson kindOfLesson, LessonDate date, Client client) {
        super(employee, kindOfLesson, date);
        this.client = client;
    }

    public IndividaulLessonData() {
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
