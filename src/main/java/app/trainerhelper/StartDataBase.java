package app.trainerhelper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StartDataBase {

    private ClientRepo clientRepo;

    @Autowired
    public StartDataBase(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void runDataBase(){
        ClientData clientData = new ClientData("Renata", "renata@wp.pl");
        clientRepo.save(clientData);
    }
}
