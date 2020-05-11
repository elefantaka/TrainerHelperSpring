package app;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import service.ClientService;
import service.EmployeeService;
import service.GroupLessonService;
import service.IApplication;
import systemmodel.Client;
import systemmodel.GroupLesson;
import systemmodel.Schedule;

import java.io.IOException;
import java.util.ArrayList;

@Service
public class ApplicationService implements IApplication {

    //private ClientService clientService;
    //private EmployeeService employeeService;
    private GroupLessonService groupLessonService;
    private Schedule schedule;


    private ApplicationService() throws IOException, ClassNotFoundException {

        //clientService = new ClientService();
        //employeeService = new EmployeeService();
        schedule = new Schedule();
        //groupLessonService = new GroupLessonService();
        //employeeService = new EmployeeService();
    }

    public ArrayList<GroupLesson> getSchedule() throws IOException, ClassNotFoundException {
        //show the schedule
        return schedule.getView();
    }

    public GroupLesson showLesson(int id){

        return groupLessonService.findGroupLesson(id);
    }

    //enter client and lesson id on the website and then the client could be register
    public void registerClient(int idClient, int idLesson) throws IOException, ClassNotFoundException {
        //Client client = clientService.findClient(idClient);
        //schedule.registerClient(client, idLesson);
    }

    public void addNewClient(Client client) throws IOException {

        //clientService.addAndSaveClient(client);
    }
}