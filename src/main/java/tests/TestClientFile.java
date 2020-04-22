package tests;

import database.ClientFile;
import systemmodel.Client;

import java.io.IOException;
import java.util.ArrayList;

public class TestClientFile {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("ClientFile test");

        ArrayList<Client> clients = new ArrayList<>();

        ClientFile clientFile = new ClientFile();

        Client client = new Client(1, "Jacek", "jacek@wp.pl");
        Client client1 = new Client(2, "Michal", "michal@wp.pl");

        clients.add(client);
        clients.add(client1);

        clientFile.saveClients(clients);

        clientFile.readClients();
    }
}
