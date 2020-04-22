package tests;

import database.GroupLessonFile;
import systemmodel.*;

import java.io.IOException;
import java.util.ArrayList;

public class TestGroupLessonFile {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("GroupLessonFile Test");

        ArrayList<GroupLesson> groupLessons = new ArrayList<>();

        GroupLessonFile groupLessonFile = new GroupLessonFile();

        Employee employee = new Employee(1, "Kasia", "kasia@wp.pl", KindOfInstructor.YogaInstructor);

        LessonDate lessonDate = new LessonDate(2020, 3, 3, 13);

        GroupLesson groupLesson = new GroupLesson(1, employee, KindOfLesson.BallRoomDancing, lessonDate, 5);

        Client client = new Client(1, "Ewa", "ewa@wp.pl");

        groupLessons.add(groupLesson);

        groupLesson.recordTheClient(client);

        groupLessonFile.saveGroupLesson(groupLessons);

        groupLessonFile.readGroupLesson();
    }
}
