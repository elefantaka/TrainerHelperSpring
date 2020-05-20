package app.trainerhelper;

import database.EmployeeData;
import database.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    private EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeController(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @GetMapping("/employees")
    public String showEmployees(Model model){

        Iterable<EmployeeData> employeeData = employeeRepo.findAll();
        model.addAttribute("employeeData", employeeData);

        return "employeesPage";
    }
}
