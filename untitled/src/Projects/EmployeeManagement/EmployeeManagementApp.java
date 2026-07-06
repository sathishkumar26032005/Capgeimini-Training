package Projects.EmployeeManagement;
//import com.ems.model.Address;
//import com.ems.model.ContractEmployee;
//import com.ems.model.Department;
//import com.ems.model.FullTimeEmployee;
//import com.ems.model.PartTimeEmployee;
//import com.ems.service.EmployeeService;

public class EmployeeManagementApp {

    public static void main(String[] args) {

        EmployeeService service = new EmployeeService();

        Address a1 = new Address("Chennai", "Tamil Nadu", "India");

        Address a2 = new Address("Coimbatore", "Tamil Nadu", "India");

        Address a3 = new Address("Salem", "Tamil Nadu", "India");

        FullTimeEmployee emp1 = new FullTimeEmployee(101, "sathish", Department.IT, a1, 50000);

        PartTimeEmployee emp2 = new PartTimeEmployee(102, "logesh", Department.HR, a2, 80, 300);

        ContractEmployee emp3 = new ContractEmployee(103, "Ravi", Department.FINANCE, a3, 40000);



        service.addEmployee(emp1);
        service.addEmployee(emp2);
        service.addEmployee(emp3);
        service.updatename(101,"pravin");
        service.delete(101);
        service.displayEmployees();
    }
}