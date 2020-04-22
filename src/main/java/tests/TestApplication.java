package tests;

import service.Application;
import systemmodel.Client;

import java.io.IOException;

public class TestApplication {

    public void testAddClient() throws IOException, ClassNotFoundException {
        Application application = new Application();

        Client client = new Client(0, "Karol", "karol@wp.pl");

        application.addNewClient(client); //save new client
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //more functions
        TestApplication testApplication = new TestApplication();

        testApplication.testAddClient();
    }
}
