package service;

import database.ClientData;
import database.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.ArrayList;

public class ClientService {

    private ClientRepo clientRepo;

    @Autowired
    public ClientService(ClientRepo clientRepo){
        this.clientRepo = clientRepo;
    }

    private Iterable<ClientData> clients = new ArrayList<>();

    public ClientService() throws IOException, ClassNotFoundException {

        //ClientFile clientFile = new ClientFile();
        clients = clientRepo.findAll();
        //clients = clientFile.readClients();
    }

    /*private int findMaxId(){

        int maxId = 0;

        for(ClientData c : clients){
            if(c.getId() > maxId){
                maxId = c.getId();
            }
        }
        return maxId;
    }*/

    public void addAndSaveClient(ClientData clientData) throws IOException {

        /*ClientFile clientFile = new ClientFile();

        //int newId = findMaxId() + 1;
        //client.setId(newId);

        clients.add(client);
        clientFile.saveClients(clients);*/
    }

    public ClientData findClient(int idFindClient) {

        for(ClientData c : clients){
            if(c.getId() == idFindClient){
                return c;
            }
        }
        return null;
    }
}
