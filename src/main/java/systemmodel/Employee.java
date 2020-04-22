package systemmodel;

import java.io.Serializable;

public class Employee implements Serializable {

    protected int id;
    protected String name;
    protected String email;
    protected KindOfInstructor instructor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public KindOfInstructor getInstructor() {
        return instructor;
    }

    public void setInstructor(KindOfInstructor instructor) {
        this.instructor = instructor;
    }

    public Employee(int id, String name, String email, KindOfInstructor instructor) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", instructor=" + instructor +
                '}';
    }
}


