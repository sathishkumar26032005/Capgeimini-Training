package Day20;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
public class jdbccon {
    public static void main(String[] args)throws ClassNotFoundException {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/task","root","2212164580");
            Statement st=con.createStatement();
            String qu="insert into Department(dept_id,dept_name,location)"+"values(108,'student','salem')";
            int res=st.executeUpdate(qu);
            if(res>0){
                System.out.println("inserted");
            }
            st.close();
            con.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (SQLException c){
            c.printStackTrace();
        }
    }

}
