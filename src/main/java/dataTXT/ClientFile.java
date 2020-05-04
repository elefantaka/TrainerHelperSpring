package dataTXT;

import systemmodel.Client;

import java.io.*;
import java.util.ArrayList;

public class ClientFile {

    public void saveClients(ArrayList<Client> clients) throws IOException {

        File file = new File(Configuration.folder, Configuration.clientsFile);

        FileOutputStream fileStream = new FileOutputStream(file);

        ObjectOutputStream obj = new ObjectOutputStream(fileStream);

        for(Client c : clients){

            obj.writeObject(c);
        }

        obj.close();
    }

    public ArrayList<Client> readClients() throws IOException, ClassNotFoundException {

        ArrayList<Client> clients = new ArrayList<>();

        File file = new File(Configuration.folder, Configuration.clientsFile);

        FileInputStream fileInput = new FileInputStream(file);

        ObjectInputStream obj = new ObjectInputStream(fileInput);

        Client c = (Client) obj.readObject();
        try {
            while (c != null) {

                clients.add(c);
                System.out.println("Client readed correctly " + c);
                c = (Client) obj.readObject();
            }
        }
        catch(Exception ex){
        }
        obj.close();

        return clients;
    }
}
