package database;

import javax.persistence.*;

@Entity
public class SaveLessonData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrement
    Long id;

    @ManyToOne
    @JoinColumn(name = "groupLesson_id", referencedColumnName = "id")
    private GroupLessonData groupLessonData;

    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "id")
    private ClientData clientData;

    public SaveLessonData(GroupLessonData groupLessonData, ClientData clientData) {

        this.groupLessonData = groupLessonData;
        this.clientData = clientData;
    }

    public SaveLessonData(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public GroupLessonData getGroupLessonData() {
        return groupLessonData;
    }

    public void setGroupLessonData(GroupLessonData groupLessonData) {
        this.groupLessonData = groupLessonData;
    }

    public ClientData getClientData() {
        return clientData;
    }

    public void setClientData(ClientData clientData) {
        this.clientData = clientData;
    }

    @Override
    public String toString() {
        return "SaveLessonData{" +
                "id=" + id +
                ", groupLessonData=" + groupLessonData +
                ", clientData=" + clientData +
                '}';
    }
}
