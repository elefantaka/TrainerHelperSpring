package database;

import systemmodel.KindOfInstructor;

import javax.persistence.*;

@Entity
public class EmployeeData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    protected String name;
    protected String email;

    @Enumerated(EnumType.STRING)
    protected KindOfInstructor instructor;

    public EmployeeData() {
    }

    public EmployeeData(String name, String email, KindOfInstructor instructor){
        this.name = name;
        this.email = email;
        this.instructor = instructor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
}
