package Projects.SimpleEmployee;
import  Projects.SimpleEmployee.Employee;
import java.util.ArrayList;
import java.util.*;
public class EmployeeService {
    List<Employee> list=new ArrayList<>();

    //addEmployee(Employee e) — throws IllegalArgumentException if an employee with the same id already exists.
    public void add(Employee data)throws  IllegalArgumentException{
        if(list.contains(data)){
            throw new IllegalArgumentException("I this id already in the data base");
        }
        else{
            list.add(data);
        }
    }
    Map<String ,List<Employee>> map=new HashMap<>();
    public void Employegroup(){
        for(Employee d:list){
            if(map.containsKey(d.getDept())){
                map.get(d.getDept()).add(d);
            }
            else{
                List<Employee> li=new ArrayList<>();
                li.add(d);
                map.put(d.getDept(),li);
            }
        }
        for(String dep:map.keySet()){
            System.out.println(dep);
            List<Employee> list1=map.get(dep);
            for(Employee d:list1){
                System.out.println(d);
            }
        }
    }
    //Map<String, Double> averageSalaryByDepartment() — compute average salary per department.
    public void AverageSalary(){
        Map<String,Double> ma=new HashMap<>();
        for(String dep:map.keySet()){
            List<Employee> l=map.get(dep);
            Double sum=0.0;
            for(Employee da:l){
                sum+= da.getSalary();
            }
            ma.put(dep,sum/l.size());
        }
    }

    //List<Employee> topNEarners(int n) — return the top N highest-paid employees.
    public void topN(int n){
        Collections.sort(list);
        int p= (list.size()-n)+1;
        for (Employee d:list){
            if (p--==0){
                System.out.println(d);
                return;
            }
        }
    }
    public void displeu(){
        for(Employee d:list){
            System.out.println(d);
        }
    }


}
