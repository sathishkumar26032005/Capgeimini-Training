package Projects.EmployeeManagement;

public class ContractEmployee extends Employee {

    private double contractAmount;

    public ContractEmployee(int empId,
                            String name,
                            Department dept,
                            Address add,
                            double contractAmount) {

        super(empId, name, dept, add);
        this.contractAmount = contractAmount;
    }

    @Override
    public double calSalary() {
        return contractAmount;
    }
}