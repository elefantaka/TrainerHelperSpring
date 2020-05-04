package database;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SaveLessonData {

    @Id
    Long id;

    Long lessonId;
    Long clientId;

    public SaveLessonData(Long lessonId, Long clientId) {

        this.lessonId = lessonId;
        this.clientId = clientId;
    }

    public SaveLessonData() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLessonId() {
        return lessonId;
    }

    public void setLessonId(Long lessonId) {
        this.lessonId = lessonId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }
}
