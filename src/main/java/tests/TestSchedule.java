package tests;

import systemmodel.GroupLesson;
import systemmodel.Schedule;

import java.io.IOException;
import java.util.ArrayList;

public class TestSchedule {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Test Schedule");

        Schedule schedule = new Schedule();

        ArrayList<GroupLesson> groupLessons = schedule.getView();

        for(GroupLesson g : groupLessons) {
            System.out.println(groupLessons);
        }
    }
}
