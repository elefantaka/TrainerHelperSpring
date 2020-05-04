package systemmodel;

import dataTXT.GroupLessonFile;
import service.GroupLessonService;

import java.io.IOException;
import java.util.ArrayList;

public class Schedule {
    private GroupLessonService groupLessonService;

    public ArrayList<GroupLesson> getView() throws IOException, ClassNotFoundException {

        GroupLessonFile groupLessonFile = new GroupLessonFile();
        return groupLessonFile.readGroupLesson(); //temporary show whole group lessons, later it will show one
    }

    public void registerClient(Client client, int idLesson) throws IOException, ClassNotFoundException {

        GroupLessonService groupLessonService = new GroupLessonService();

        GroupLesson foundLesson = groupLessonService.findGroupLesson(idLesson);
        foundLesson.recordTheClient(client);

        groupLessonService.addAndSaveGroupLesson(foundLesson);
    }

    public void addAndSave(GroupLesson groupLesson) throws IOException {

        groupLessonService.addAndSaveGroupLesson(groupLesson);
    }
}
