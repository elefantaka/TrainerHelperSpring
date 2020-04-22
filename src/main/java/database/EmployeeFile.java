package database;

import systemmodel.Employee;

import java.io.*;
import java.util.ArrayList;

public class EmployeeFile {

    public void saveEmployee(ArrayList<Employee> employees) throws IOException {

        File file = new File(Configuration.folder, Configuration.employeesFile);

        FileOutputStream fileStream = new FileOutputStream(file);

        ObjectOutputStream obj = new ObjectOutputStream(fileStream);

            for(Employee e : employees) {

                obj.writeObject(e);
            }
        obj.close();
    }

    public ArrayList<Employee> readEmployees() throws IOException, ClassNotFoundException {

        ArrayList<Employee> employees = new ArrayList<>();

        File file = new File(Configuration.folder, Configuration.employeesFile);

        FileInputStream fileStream = new FileInputStream(file);

        ObjectInputStream obj = new ObjectInputStream(fileStream);

        Employee e = (Employee) obj.readObject();

            try {
                while (e != null) {
                    employees.add(e);
                    System.out.println("Employee readed correctly " + e);
                    e = (Employee) obj.readObject();
                }

            }
            catch(Exception ex){
        }

            obj.close();

            return employees;
    }
}
