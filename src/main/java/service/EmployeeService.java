package service;

import dataTXT.EmployeeFile;
import systemmodel.Employee;

import java.io.IOException;
import java.util.ArrayList;

public class EmployeeService {

    private ArrayList<Employee> employees = new ArrayList<>();

    public EmployeeService() throws IOException, ClassNotFoundException {

        EmployeeFile employeeFile = new EmployeeFile();
        employees = employeeFile.readEmployees();
    }

    public int findMaxId(){

        int maxId = 0;

        for(Employee e : employees) {
            if (e.getId() > maxId) {
                maxId = e.getId();
            }
        }
        return maxId;
    }

    public void addAndSaveEmployee(Employee employee) throws IOException {

        EmployeeFile employeeFile = new EmployeeFile();

        int newId = findMaxId() + 1;
        employee.setId(newId);

        employees.add(employee);
        employeeFile.saveEmployee(employees);
    }

    public Employee findEmployee(int idFindEmployee){

        for(Employee e : employees){
            if(e.getId() == findMaxId()){
                return e;
            }
        }
        return null;
    }
}
