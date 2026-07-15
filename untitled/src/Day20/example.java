package Day20;

import java.time.LocalDate;

public class example {
    public static void main(String[] args) {
        Employee em1=new Employee(1,"sathish","IT",
                LocalDate.of(2005,3,26),LocalDate.now(),30000.0);
        EmployeeDAO fun=new EmployeeDAO();
        fun.isert(em1);
    }
}
