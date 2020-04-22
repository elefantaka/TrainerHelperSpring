package tests;

import database.IndividualLessonFile;
import systemmodel.*;

import java.io.IOException;
import java.util.ArrayList;

public class TestIndividualLessonFile {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("IndividualLessonFile test");

        ArrayList<IndividualLesson> individualLessons = new ArrayList<>();

        IndividualLessonFile individualLessonFile = new IndividualLessonFile();

        Employee employee = new Employee(1, "Renata", "renata@wp.pl", KindOfInstructor.SwimmingInstructor);

        LessonDate lessonDate = new LessonDate(2020, 3, 21, 12);

        Client client = new Client(1, "Ola", "ola@wp.pl");

        IndividualLesson individualLesson = new IndividualLesson(1, employee, KindOfLesson.Swimming, lessonDate, client);

        individualLessons.add(individualLesson);

        individualLessonFile.saveIndividualLesson(individualLessons);

        individualLessonFile.readIndividualLesson();
    }
}
