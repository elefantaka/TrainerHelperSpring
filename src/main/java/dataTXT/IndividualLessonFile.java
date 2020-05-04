package dataTXT;

import systemmodel.IndividualLesson;

import java.io.*;
import java.util.ArrayList;

public class IndividualLessonFile {

    public void saveIndividualLesson(ArrayList<IndividualLesson> individualLessons) throws IOException {

        File file = new File(Configuration.folder, Configuration.individualLessonFile);

        FileOutputStream fileOutputStream = new FileOutputStream(file);

        ObjectOutputStream obj = new ObjectOutputStream(fileOutputStream);

        for(IndividualLesson i : individualLessons){

            obj.writeObject(i);
        }
        obj.close();
    }

    public ArrayList<IndividualLesson> readIndividualLesson() throws IOException, ClassNotFoundException {

        ArrayList<IndividualLesson> individualLessons = new ArrayList<>();

        File file = new File(Configuration.folder, Configuration.individualLessonFile);

        FileInputStream fileInputStream = new FileInputStream(file);

        ObjectInputStream obj = new ObjectInputStream(fileInputStream);

        IndividualLesson i = (IndividualLesson) obj.readObject();

        try {
            while (i != null) {

                individualLessons.add(i);
                System.out.println("Individual lesson readed correctly " + i);
                i = (IndividualLesson) obj.readObject();
            }
        }
        catch(Exception ex){
        }
        obj.close();

        return individualLessons;
    }
}
