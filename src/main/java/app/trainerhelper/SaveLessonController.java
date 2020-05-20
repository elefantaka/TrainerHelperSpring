package app.trainerhelper;

import database.ClientData;
import database.GroupLessonData;
import database.SaveLessonData;
import database.SaveLessonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SaveLessonController {

    private SaveLessonRepo saveLessonRepo;

    @Autowired
    public SaveLessonController(SaveLessonRepo saveLessonRepo) {
        this.saveLessonRepo = saveLessonRepo;
    }

    @GetMapping("/savedLessons")
    public String showSavedLesson(Model model){

        Iterable<SaveLessonData> saveLessonData = saveLessonRepo.findAll();
        model.addAttribute("saveLessonData", saveLessonData);

        return "savedLessonsPage";
    }

//    @GetMapping("/savedLessons")
//    public String delete( Model model){
//
//        SaveLessonData saveLessonData = new SaveLessonData();
//        model.addAttribute("saveLessonData", saveLessonData);
//
//        return "savedLessonsPage";
//    }
//
//    @PostMapping("/savedLessons")
//    public String deleteSubmit(@RequestParam(name = "groupLessonData") GroupLessonData groupLessonData, @RequestParam(name = "clientData") ClientData clientData, @ModelAttribute SaveLessonData saveLessonData){
//
//        saveLessonData.setGroupLessonData(groupLessonData);
//        saveLessonData.setClientData(clientData);
//
//        saveLessonRepo.delete(saveLessonData);
//
//        return "savedLessonsPage";
//    }

    @GetMapping("/signUp")
    public String signUp( Model model){

        SaveLessonData saveLessonData = new SaveLessonData();
        model.addAttribute("saveLessonData", saveLessonData);

        return "signUpPage";
    }

    @PostMapping("/signUp")
    public String signUpSubmit(@RequestParam(name = "groupLessonData") GroupLessonData groupLessonData, @RequestParam(name = "clientData") ClientData clientData, @ModelAttribute SaveLessonData saveLessonData){

        saveLessonData.setGroupLessonData(groupLessonData);
        saveLessonData.setClientData(clientData);

        saveLessonRepo.save(saveLessonData);

        return "result";
    }
}
