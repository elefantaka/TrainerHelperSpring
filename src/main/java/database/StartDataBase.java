package database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import systemmodel.*;

@Component
public class StartDataBase {

    private ClientRepo clientRepo;
    private EmployeeRepo employeeRepo;
    private GroupLessonRepo groupLessonRepo;

    @Autowired
    public StartDataBase(ClientRepo clientRepo, EmployeeRepo employeeRepo, GroupLessonRepo groupLessonRepo) {

        this.clientRepo = clientRepo;
        this.employeeRepo = employeeRepo;
        this.groupLessonRepo = groupLessonRepo;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void runDataBase(){

        ClientData clientData = new ClientData("Renata", "renata@wp.pl");
        ClientData clientData1 = new ClientData("Basia", "basia@wp.pl");
        ClientData clientData2 = new ClientData("Jarek", "jarek@wp.pl");
        ClientData clientData3 = new ClientData("Karol", "karol@wp.pl");
        ClientData clientData4 = new ClientData("Jacek", "jacek@wp.pl");
        ClientData clientData5 = new ClientData("Ewelina", "ewelina@wp.pl");
        ClientData clientData6 = new ClientData("Adrian", "adrian@wp.pl");
        ClientData clientData7 = new ClientData("Staszek", "staszek@wp.pl");
        ClientData clientData8 = new ClientData("Julia", "julia@wp.pl");
        ClientData clientData9 = new ClientData("Michal", "michal@wp.pl");

        clientRepo.save(clientData);
        clientRepo.save(clientData1);
        clientRepo.save(clientData2);
        clientRepo.save(clientData3);
        clientRepo.save(clientData4);
        clientRepo.save(clientData5);
        clientRepo.save(clientData6);
        clientRepo.save(clientData7);
        clientRepo.save(clientData8);
        clientRepo.save(clientData9);

        EmployeeData employeeData = new EmployeeData("Kamil", "kamil@wp.pl", KindOfInstructor.BallRoomDancingInstructor);
        EmployeeData employeeData1 = new EmployeeData("Zuzia", "zuzia@wp.pl", KindOfInstructor.ZumbaInstructor);
        EmployeeData employeeData2 = new EmployeeData("Eryk", "eryk@wp.pl", KindOfInstructor.SwimmingInstructor);
        EmployeeData employeeData3 = new EmployeeData("Agnieszka", "agnieszka@wp.pl", KindOfInstructor.SynchronizedSwimmingInstructor);
        EmployeeData employeeData4 = new EmployeeData("Tomasz", "tomasz@wp.pl", KindOfInstructor.YogaInstructor);
        EmployeeData employeeData5 = new EmployeeData("Radek", "radek@wp.pl", KindOfInstructor.HealthySpineInstructor);

        employeeRepo.save(employeeData);
        employeeRepo.save(employeeData1);
        employeeRepo.save(employeeData2);
        employeeRepo.save(employeeData3);
        employeeRepo.save(employeeData4);
        employeeRepo.save(employeeData5);

        Employee employee = new Employee(1, "basia", "basia@wp.pl", KindOfInstructor.BallRoomDancingInstructor);
        Client client = new Client(1, "kamil", "kamil@wp.pl");
        LessonDate lessonDate = new LessonDate(2020, 3, 12, 5);


        GroupLessonData groupLessonData = new GroupLessonData(employee, KindOfLesson.BallRoomDancing, lessonDate, 5, 3, client);
        groupLessonRepo.save(groupLessonData);
    }
}
