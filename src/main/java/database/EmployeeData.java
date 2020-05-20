package database;

import systemmodel.KindOfInstructor;

import javax.persistence.*;

@Entity
public class EmployeeData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @Enumerated(EnumType.STRING)
    private KindOfInstructor kindOfInstructor;

    public EmployeeData() {
    }

    public EmployeeData(String name, String email, KindOfInstructor kindOfInstructor){
        this.name = name;
        this.email = email;
        this.kindOfInstructor = kindOfInstructor;
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

    public KindOfInstructor getKindOfInstructor() {
        return kindOfInstructor;
    }

    public void setKindOfInstructor(KindOfInstructor kindOfInstructor) {
        this.kindOfInstructor = kindOfInstructor;
    }

    @Override
    public String toString() {
        return "EmployeeData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", instructor=" + kindOfInstructor +
                '}';
    }
}
