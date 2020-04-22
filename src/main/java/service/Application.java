package service;

import systemmodel.Client;
import systemmodel.GroupLesson;
import systemmodel.Schedule;

import java.io.IOException;
import java.util.ArrayList;

public class Application implements IApplication {

    private ClientService clientService;
    private EmployeeService employeeService;
    private GroupLessonService groupLessonService;
    private Schedule schedule;

    public Application() throws IOException, ClassNotFoundException {

        clientService = new ClientService();
        employeeService = new EmployeeService();
        schedule = new Schedule();

    }

    public ArrayList<GroupLesson> getSchedule() throws IOException, ClassNotFoundException {
        //show the schedule
        return schedule.getView();
    }

    //TO CHECK

    public GroupLesson showLesson(int id){
        return groupLessonService.findGroupLesson(id);
                //schedule.findLesson(id); !!!!!!!!!!!
    }

    //enter client and lesson id on the website and then the client could be register
    public void registerClient(int idClient, int idLesson) throws IOException, ClassNotFoundException {
        Client client = clientService.findClient(idClient);
        schedule.registerClient(client, idLesson);
    }

    public void addNewClient(Client client) throws IOException {
        clientService.addAndSaveClient(client);
    }
}