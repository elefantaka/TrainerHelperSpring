package service;

import dataTXT.GroupLessonFile;
import systemmodel.GroupLesson;

import java.io.IOException;
import java.util.ArrayList;

public class GroupLessonService {

    private ArrayList<GroupLesson> groupLessons = new ArrayList<>();

    public GroupLessonService() throws IOException, ClassNotFoundException {

        GroupLessonFile groupLessonFile = new GroupLessonFile();
        groupLessons = groupLessonFile.readGroupLesson();
    }

    public int findMaxId(){

        int maxId = 0;

        for(GroupLesson g : groupLessons){
            if(g.getId() > maxId){
                maxId = g.getId();
            }
        }
        return maxId;
    }

    public void addAndSaveGroupLesson(GroupLesson groupLesson) throws IOException {

        GroupLessonFile groupLessonFile = new GroupLessonFile();

        int newId = findMaxId() + 1;
        groupLesson.setId(newId);

        groupLessons.add(groupLesson);
        groupLessonFile.saveGroupLesson(groupLessons);
    }

    public GroupLesson findGroupLesson(int idFindGroup){

        for(GroupLesson g : groupLessons){
            if(g.getId() == idFindGroup){
                return g;
            }
        }
        return null;
    }
}
