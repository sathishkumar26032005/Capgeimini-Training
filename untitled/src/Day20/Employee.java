package Day20;

import java.time.LocalDate;

public class Employee {
    private int id;
    private String name,designation;
    private LocalDate dob,doj;
    private double salary;

    public Employee(int id,  String name, String designation,LocalDate dob,  LocalDate doj,double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.dob = dob;

        this.doj = doj;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
