package dataTXT;

import systemmodel.GroupLesson;

import java.io.*;
import java.util.ArrayList;

public class GroupLessonFile {

    public void saveGroupLesson(ArrayList<GroupLesson> groupLessons) throws IOException {

        File file = new File(Configuration.folder, Configuration.groupLessonFile);

        FileOutputStream fileStream = new FileOutputStream(file);

        ObjectOutputStream obj = new ObjectOutputStream(fileStream);

        for(GroupLesson g : groupLessons) {

            obj.writeObject(g);
        }
        obj.close();
    }

    public ArrayList<GroupLesson> readGroupLesson() throws IOException, ClassNotFoundException {

        ArrayList<GroupLesson> groupLessons = new ArrayList<>();

        File file = new File(Configuration.folder, Configuration.groupLessonFile);

        FileInputStream fileStream = new FileInputStream(file);

        ObjectInputStream obj = new ObjectInputStream(fileStream);

        GroupLesson g = (GroupLesson) obj.readObject();

        try {
            while (g != null) {
                groupLessons.add(g);
                System.out.println("Group lesson readed correctly " + g);
                g = (GroupLesson) obj.readObject();
            }
        }
        catch(Exception ex){
        }
        obj.close();

        return groupLessons;
    }
}
