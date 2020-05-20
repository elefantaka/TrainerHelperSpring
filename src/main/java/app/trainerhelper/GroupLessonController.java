package app.trainerhelper;

import database.GroupLessonData;
import database.GroupLessonRepo;
import database.SaveLessonData;
import database.SaveLessonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class GroupLessonController {

    private GroupLessonRepo groupLessonRepo;
    private SaveLessonRepo saveLessonRepo;

    public GroupLessonController(GroupLessonRepo groupLessonRepo, SaveLessonRepo saveLessonRepo) {
        this.groupLessonRepo = groupLessonRepo;
        this.saveLessonRepo = saveLessonRepo;
    }

    @GetMapping("/home")
    public String helloController(Model model) {

        Iterable<GroupLessonData> groupLessonData = groupLessonRepo.findAll();

        model.addAttribute("groupLesson", groupLessonData);

        return "homePage";
    }

    @GetMapping("/lessonDetails")
    public String showOneLesson(@RequestParam(name = "id") Long id, Model model) {

        Optional<GroupLessonData> groupLessonData = groupLessonRepo.findById(id);
        model.addAttribute("groupLesson", groupLessonData);

        Iterable<SaveLessonData> saveLessonData = saveLessonRepo.findByGroupLessonData(groupLessonData);
        model.addAttribute("saveLessonData", saveLessonData);

        return "lessonDetails";
    }
}
