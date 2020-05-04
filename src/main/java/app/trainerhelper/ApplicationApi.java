package app.trainerhelper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import systemmodel.GroupLesson;

import java.io.IOException;
import java.util.ArrayList;

@Controller
public class ApplicationApi {

    //dependency injection
    private Application application;

    @Autowired
    public ApplicationApi(Application application) {
        this.application = application;
    }

    @GetMapping("/home")
    public String helloController(Model model) throws IOException, ClassNotFoundException {

        ArrayList<GroupLesson> groupLessons = application.getSchedule();

        model.addAttribute("groupLessons", groupLessons);

        return "homePage";
    }

    @GetMapping("/lessonDetails")
    public String showOneLesson(@RequestParam(name = "id") int id, Model model) throws IOException, ClassNotFoundException {

        GroupLesson groupLesson = application.showLesson(id);

        System.out.println(groupLesson);

        model.addAttribute("groupLesson", groupLesson);

        return "lessonDetails";
    }

    @GetMapping("/clients")
    public String showClients(){
        return "clientsPage";
    }

    @GetMapping("/employees")
    public String showEmployees(){
        return "employeesPage";
    }

    @GetMapping("/signUp")
    public String signUpForLesson(){
        return "signUpPage";
    }

    /*@PostMapping("/signUp")
    public String sendSignUp(){
        //return para liczb
    }*/
}

//TO DO: postmapping