package app.trainerhelper;

import database.ClientData;
import database.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController {

    private ClientRepo clientRepo;

    @Autowired
    public ClientController(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }

    @GetMapping("/clients")
    public String showClients(Model model){

        Iterable<ClientData> clientData = clientRepo.findAll();
        model.addAttribute("clientData", clientData);

        return "clientsPage";
    }
}
