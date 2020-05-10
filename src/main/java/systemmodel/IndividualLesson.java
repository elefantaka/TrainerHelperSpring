package systemmodel;

import java.io.Serializable;

public class IndividualLesson extends SportLesson implements Serializable {

    private Client client;

    public IndividualLesson(int id, Employee employee, KindOfLesson lesson, String date, Client client) {
        super(id, employee, lesson, date);
        this.client = client;
    }

    @Override
    public java.lang.String toString() {
        return "IndividualLesson{" + super.toString() +
                "client=" + client +
                '}';
    }
}
