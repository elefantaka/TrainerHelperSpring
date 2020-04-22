package service;

import systemmodel.Client;
import systemmodel.GroupLesson;

import java.io.IOException;
import java.util.ArrayList;

public interface IApplication {

    //taki spis stron
    //TO DO: more pages
    ArrayList<GroupLesson> getSchedule() throws IOException, ClassNotFoundException;
    GroupLesson showLesson(int id);
    void registerClient(int idClient, int idGroup) throws IOException, ClassNotFoundException; //formularz
    void addNewClient(Client client) throws IOException;
}
