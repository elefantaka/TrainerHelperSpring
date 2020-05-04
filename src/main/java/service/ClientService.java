package service;

import dataTXT.ClientFile;
import systemmodel.Client;

import java.io.IOException;
import java.util.ArrayList;

public class ClientService {

    private ArrayList<Client> clients = new ArrayList<>();

    public ClientService() throws IOException, ClassNotFoundException {

        ClientFile clientFile = new ClientFile();
        clients = clientFile.readClients();
    }

    private int findMaxId(){

        int maxId = 0;

        for(Client c : clients){
            if(c.getId() > maxId){
                maxId = c.getId();
            }
        }
        return maxId;
    }

    public void addAndSaveClient(Client client) throws IOException {

        ClientFile clientFile = new ClientFile();

        int newId = findMaxId() + 1;
        client.setId(newId);

        clients.add(client);
        clientFile.saveClients(clients);
    }

    public Client findClient(int idFindClient) {

        for(Client c : clients){
            if(c.getId() == idFindClient){
                return c;
            }
        }
        return null;
    }
}
