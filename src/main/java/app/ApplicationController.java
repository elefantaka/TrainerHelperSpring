package app;

import database.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import systemmodel.GroupLesson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;

@Controller
public class ApplicationController {

    private ApplicationService applicationService;
    private ClientRepo clientRepo;
    private EmployeeRepo employeeRepo;
    private GroupLessonRepo groupLessonRepo;
    private SaveLessonRepo saveLessonRepo;

    @Autowired
    public ApplicationController(ApplicationService applicationService, ClientRepo clientRepo, EmployeeRepo employeeRepo, GroupLessonRepo groupLessonRepo, SaveLessonRepo saveLessonRepo) {

        this.applicationService = applicationService;
        this.clientRepo = clientRepo;
        this.employeeRepo = employeeRepo;
        this.groupLessonRepo = groupLessonRepo;
        this.saveLessonRepo = saveLessonRepo;
    }

    @GetMapping("/home")
    public String helloController(Model model) throws IOException, ClassNotFoundException {

        //ArrayList<GroupLesson> groupLessons = applicationService.getSchedule();
        //model.addAttribute("groupLessons", groupLessons);

        Iterable<GroupLessonData> groupLessonData = groupLessonRepo.findAll();

        model.addAttribute("groupLesson", groupLessonData);

        return "homePage";
    }

    @GetMapping("/lessonDetails")
    public String showOneLesson(@RequestParam(name = "id") Long id, Model model) throws IOException, ClassNotFoundException {

        //GroupLesson groupLesson = applicationService.showLesson(id);
        //System.out.println(groupLesson);
        //model.addAttribute("groupLesson", groupLesson);

        Optional<GroupLessonData> groupLessonData = groupLessonRepo.findById(id);

        model.addAttribute("groupLesson", groupLessonData);

        return "lessonDetails";
    }

    @GetMapping("/clients")
    public String showClients(Model model){

        Iterable<ClientData> clientData = clientRepo.findAll();
        model.addAttribute("clientData", clientData);

        return "clientsPage";
    }

    @GetMapping("/employees")
    public String showEmployees(Model model){

        Iterable<EmployeeData> employeeData = employeeRepo.findAll();
        model.addAttribute("employeeData", employeeData);

        return "employeesPage";
    }

    @GetMapping("/savedLessons")
    public String showSavedLesson(Model model){

        Iterable<SaveLessonData> saveLessonData = saveLessonRepo.findAll();
        model.addAttribute("saveLessonData", saveLessonData);

         return "savedLessonsPage";
    }

    @GetMapping("/signUp")
    public String signUp(Model model){

        SaveLessonData saveLessonData = new SaveLessonData();
        model.addAttribute("saveLessonData", saveLessonData);

        saveLessonRepo.save(saveLessonData);

        return "signUpPage";
    }

    @PostMapping("/signUp")
    public String signUpSubmit(@ModelAttribute SaveLessonData saveLessonData){
        return "result";
    }
}