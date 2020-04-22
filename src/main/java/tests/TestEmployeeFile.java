package tests;

import database.EmployeeFile;
import systemmodel.Employee;
import systemmodel.KindOfInstructor;

import java.io.IOException;
import java.util.ArrayList;

public class TestEmployeeFile {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("EmplyeeFile Test");

        ArrayList<Employee> employees = new ArrayList<>();

        EmployeeFile employeeFile = new EmployeeFile();

        Employee employee = new Employee(1, "Kamila", "kamila@wp.pl", KindOfInstructor.SwimmingInstructor);

        Employee employee1 = new Employee(2, "Tomek", "tomek@wp.pl", KindOfInstructor.ZumbaInstructor);

        employees.add(employee);
        employees.add(employee1);

        employeeFile.saveEmployee(employees);

        employeeFile.readEmployees();
    }
}
