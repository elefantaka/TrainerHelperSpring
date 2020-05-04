package service;

import dataTXT.IndividualLessonFile;
import systemmodel.IndividualLesson;

import java.io.IOException;
import java.util.ArrayList;

public class IndividualLessonService {

    private ArrayList<IndividualLesson> individualLessons = new ArrayList<>();

    public IndividualLessonService() throws IOException, ClassNotFoundException {

        IndividualLessonFile individualLessonFile = new IndividualLessonFile();
        individualLessons = individualLessonFile.readIndividualLesson();
    }

    public int findMaxId(){

        int maxId = 0;

        for(IndividualLesson i : individualLessons){
            if(i.getId() > maxId){
                maxId = i.getId();
            }
        }
        return maxId;
    }

    public void addAndSaveIndividualLesson(IndividualLesson individualLesson) throws IOException {

        IndividualLessonFile individualLessonFile = new IndividualLessonFile();

        int newId = findMaxId() + 1;
        individualLesson.setId(newId);

        individualLessons.add(individualLesson);
        individualLessonFile.saveIndividualLesson(individualLessons);
    }

    public IndividualLesson findIndividualLesson(int idFindIndividual){

        for(IndividualLesson i : individualLessons){
            if(i.getId() == idFindIndividual){
                return i;
            }
        }
        return null;
    }
}
