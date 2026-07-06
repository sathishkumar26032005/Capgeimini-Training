package Projects.EmployeeManagement;
public class FullTimeEmployee extends Employee {

    private double monthlySalary;

    public FullTimeEmployee(int empId,
                            String name,
                            Department dept,
                            Address add,
                            double monthlySalary) {

        super(empId, name, dept, add);
        this.monthlySalary = monthlySalary;
    }
    public double getsalary(){
        return monthlySalary;
    }
    public void setsalaeyforfulltime(double monthlySalary){
        this.monthlySalary=monthlySalary;
    }
    @Override
    public double calSalary() {
        return monthlySalary;
    }
}