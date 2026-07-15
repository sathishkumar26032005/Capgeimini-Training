package Projects.SimpleEmployee;
import  Projects.SimpleEmployee.Employee;
import Projects.SimpleEmployee.EmployeeService;
public class mian {
    public static void main(String[] args) {

        Employee emp1=new Employee(1,"Sathish","cse",100000.0);
        Employee emp2=new Employee(2,"Logesh","it",35000.0);
        Employee emp3=new Employee(3,"Sive","it",79975.0);
        Employee emp4=new Employee(4,"Naveen","cse",80000.0);
        Employee emp5=new Employee(5,"Ravi","it",13000.0);
        Employee emp6=new Employee(6,"Sriman","cse",52000.0);

        EmployeeService ser=new EmployeeService();
        ser.add(emp1);
        ser.add(emp2);
        ser.add(emp3);
        ser.add(emp4);
        ser.add(emp5);
        ser.add(emp6);
        ser.displeu();
        ser.topN(3);
        ser.Employegroup();

    }
}
