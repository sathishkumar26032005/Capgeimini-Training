package Projects.EmployeeManagement;

public abstract class Employee{
    protected int empId;
    protected String name;
    protected Department dept;
    protected Address add;


    public Employee(int empId,String name,Department dept,Address add) {
        this.empId=empId;
        this.name=name;
        this.dept=dept;
        this.add=add;
    }
    public int getid(){
        return empId;
    }
    public void setname (String name){
        this.name=name;
    }
    public abstract double calSalary();
    public void displayBasicInfo() {
        System.out.println("Emp Id : "+empId);
        System.out.println("Emp Name : "+name);
        System.out.println("Emp Dept : "+dept);
        System.out.println("Emp Address : "+add);
    }
}