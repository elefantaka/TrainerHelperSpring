package tests;

import dataTXT.GroupLessonFile;
import systemmodel.*;

import java.io.IOException;
import java.util.ArrayList;

public class TestGroupLessonFile {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("GroupLessonFile Test");

        ArrayList<GroupLesson> groupLessons = new ArrayList<>();

        //1
        GroupLessonFile groupLessonFile = new GroupLessonFile();

        Employee employee = new Employee(1, "Kasia", "kasia@wp.pl", KindOfInstructor.YogaInstructor);

        LessonDate lessonDate = new LessonDate(2020, 3, 3, 13);

        GroupLesson groupLesson = new GroupLesson(2, employee, KindOfLesson.BallRoomDancing, lessonDate, 5);

        Client client = new Client(1, "Ewa", "ewa@wp.pl");

        //2

        Employee employee1 = new Employee(2, "Kamil", "kamil@wp.pl", KindOfInstructor.SwimmingInstructor);

        LessonDate lessonDate1 = new LessonDate(2020, 2, 1, 12);

        GroupLesson groupLesson1 = new GroupLesson(3, employee1, KindOfLesson.HealthySpine, lessonDate1, 6);

        Client client1 = new Client(4, "Kuba", "kuba@wp.pl");

        groupLessons.add(groupLesson);

        groupLesson.recordTheClient(client);

        groupLessonFile.saveGroupLesson(groupLessons);

        groupLessons.add(groupLesson1);

        groupLesson.recordTheClient(client1);

        groupLessonFile.saveGroupLesson(groupLessons);

        groupLessonFile.readGroupLesson();
    }
}
