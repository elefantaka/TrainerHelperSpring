package database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import systemmodel.KindOfInstructor;
import systemmodel.KindOfLesson;

@Component
public class StartDataBase {

    private ClientRepo clientRepo;
    private EmployeeRepo employeeRepo;
    private GroupLessonRepo groupLessonRepo;
    private SaveLessonRepo saveLessonRepo;

    @Autowired
    public StartDataBase(ClientRepo clientRepo, EmployeeRepo employeeRepo, GroupLessonRepo groupLessonRepo, SaveLessonRepo saveLessonRepo) {
        this.clientRepo = clientRepo;
        this.employeeRepo = employeeRepo;
        this.groupLessonRepo = groupLessonRepo;
        this.saveLessonRepo = saveLessonRepo;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void runDataBase(){

//        ClientData clientData = new ClientData("Renata", "renata@wp.pl");
//        clientRepo.save(clientData);
//
//        ClientData clientData1 = new ClientData("Ewa", "ewa@wp.pl");
//        clientRepo.save(clientData1);
//
//
//        EmployeeData employeeData = new EmployeeData("Kamil", "kamil@wp.pl", KindOfInstructor.BallRoomDancingInstructor);
//        employeeRepo.save(employeeData);
//
//        GroupLessonData groupLessonData = new GroupLessonData(employeeData, KindOfLesson.BallRoomDancing, "13.00", 5);
//        groupLessonRepo.save(groupLessonData);
//
//        SaveLessonData saveLessonData = new SaveLessonData(groupLessonData, clientData);
//        saveLessonRepo.save(saveLessonData);
    }
}

//spring.jpa.open-in-view=false
