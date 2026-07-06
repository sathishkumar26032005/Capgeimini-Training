package Projects.EmployeeManagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeService {

    private List<Employee> employees =
            new ArrayList<>();

    public void addEmployee(Employee employee) {

        employees.add(employee);
        System.out.println("Added the  employee");
    }
    public  void updatename(int id,String name){
        for(Employee emp: employees){
            if(emp.getid()==id){
                emp.setname(name);
            }
        }
    }
    public void delete(int id){
        employees.removeIf(employee -> (employee.getid()==id));
    }
    public void changequation(int id){
        for(Employee emp: employees){
            if(emp.getid()==id){
                emp.setname(emp.name);
            }
        }
    }
    public void displayEmployees() {

        for(Employee emp : employees) {

            emp.displayBasicInfo();
            System.out.println(
                    "Salary : " + emp.calSalary());

            System.out.println(
                    "------------------");
        }
    }
}