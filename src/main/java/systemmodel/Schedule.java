package systemmodel;

import database.GroupLessonFile;
import service.GroupLessonService;

import java.io.IOException;
import java.util.ArrayList;

//TO CHECK!!!

public class Schedule {
    private GroupLessonService groupLessonService;
    private GroupLessonFile groupLessonFile;

    //show lesson

    public ArrayList<GroupLesson> getView() throws IOException, ClassNotFoundException {

        return groupLessonFile.readGroupLesson(); //temporary show whole group lessons, later it will show one
    }
    //TO CHECK!!! public GroupLesson findLesson(int id) - DONE IN GroupLessonService

    //TO CHECK!!!
    public void registerClient(Client client, int idLesson) throws IOException, ClassNotFoundException {

        GroupLessonService groupLessonService = new GroupLessonService();

        GroupLesson foundLesson = groupLessonService.findGroupLesson(idLesson);
        foundLesson.recordTheClient(client);

        groupLessonService.addAndSaveGroupLesson(foundLesson);
    }
    //dodawanie zajec
}
