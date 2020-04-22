package app.trainerhelper;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import service.Application;
import systemmodel.SportLesson;

import java.io.IOException;
import java.util.ArrayList;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() throws IOException, ClassNotFoundException {
        Application application = new Application();
        lista = application.getSchedule();
        for(SportLesson s : lista){
            System.out.println(s);
            return "home";
        }

    }
}
