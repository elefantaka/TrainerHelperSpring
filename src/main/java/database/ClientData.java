package database;

import javax.persistence.*;

@Entity
public class ClientData {

    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrement
    private Long id;

    private String name;
    private String email;

    public ClientData(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public ClientData() {
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

    @Override
    public String toString() {
        return "ClientData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
