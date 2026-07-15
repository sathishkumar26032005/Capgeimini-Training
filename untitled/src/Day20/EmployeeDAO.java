package Day20;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.sql.PreparedStatement;

public class EmployeeDAO {
    PreparedStatement pst=null;
    public void isert(Employee e){
        String qu="insert into Employee(id,name,designation,dob,doj,salary) values(?,?,?,?,?,?)";
        try {
            pst=DBConnection.getConnection().prepareStatement(qu);
            pst.setInt(1,e.getId());
            pst.setString(2,e.getName());
            pst.setString(3,e.getDesignation());
            pst.setDate(4, Date.valueOf(e.getDob()));
            pst.setDate(5,Date.valueOf(e.getDoj()));
            pst.setDouble(6,e.getSalary());
            int res= pst.executeUpdate();
            if(res>0){
                System.out.println("Inserted");
            }
            DBConnection.getConnection().close();
        }
        catch (SQLException e1){
            e1.printStackTrace();
        }

    }
    public void delete(int id){
        String q="delete*form Employee where id=?";
        try {
            pst=DBConnection.getConnection().prepareStatement(q);
            pst.setInt(1,id);
            int res=pst.executeUpdate();
            if (res>0){
                System.out.println("deleted");
            }
            DBConnection.getConnection().close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void update(int i,Employee e){
        String q="update Employee set id=?,name=?,desgination=?,dob=?,doj=?,salary=? where id=?";
        try {
            pst=DBConnection.getConnection().prepareStatement(q);
            pst.setInt(1,e.getId());
            pst.setString(2,e.getName());
            pst.setString(3,e.getDesignation());
            pst.setDate(4,Date.valueOf(e.getDob()));
            pst.setDate(5,Date.valueOf(e.getDoj()));
            pst.setDouble(6,e.getSalary());
            int res=pst.executeUpdate();
            if(res>0){
                System.out.println("Updated");
            }
            DBConnection.getConnection().close();
        }
        catch (SQLException l){
            l.printStackTrace();
        }
    }

    public Employee retri(int id){
        String qu="select*from Employee where id=?";
        Employee em=null;
        try {
            pst=DBConnection.getConnection().prepareStatement(qu);
            pst.setInt(1,id);
            ResultSet rs=pst.executeQuery();
            while (rs.next()){
                em=new Employee(
                       rs.getInt("id"),
                       rs.getString("name"),
                       rs.getString("Disgination"),
                        rs.getDate("dob").toLocalDate(),
                        rs.getDate("doj").toLocalDate(),
                        rs.getDouble("salary")
                );
            }
        }
        catch (SQLException k){
            k.printStackTrace();
        }
        return em;
    }
public List<Employee> ret() {

    List<Employee> emp = new ArrayList<>();

    String q = "SELECT * FROM Employee";

    try {
        pst = DBConnection.getConnection().prepareStatement(q);

        ResultSet rs = pst.executeQuery();

        while (rs.next()) {

            Employee a = new Employee(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getDate(4).toLocalDate(),
                    rs.getDate(5).toLocalDate(),
                    rs.getDouble(6)
            );

            emp.add(a);
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return emp;
}
}
