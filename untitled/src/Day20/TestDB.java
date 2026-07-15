package Day20;

import java.sql.*;

// Student Class
class Student {
    private int roll;
    private String name;
    private String course;
    private int perce;

    public Student(int roll, String name, String course, int perce) {
        this.roll = roll;
        this.name = name;
        this.course = course;
        this.perce = perce;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getPerce() {
        return perce;
    }

    public void setPerce(int perce) {
        this.perce = perce;
    }
}

// DAO Class
class StudentDAO {

    Connection con;

    public StudentDAO() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/task",
                    "root",
                    "2212164580");

            System.out.println("Database Connected Successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Insert
    public void storeStu(Student stu) {

        String sql = "INSERT INTO student(roll,name,course,perce) VALUES(?,?,?,?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, stu.getRoll());
            ps.setString(2, stu.getName());
            ps.setString(3, stu.getCourse());
            ps.setInt(4, stu.getPerce());

            int res = ps.executeUpdate();

            if (res > 0) {
                System.out.println("Student Inserted Successfully.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Update
    public void updateStu(int roll, Student stu) {

        String sql = "UPDATE student SET name=?, course=?, perce=? WHERE roll=?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, stu.getName());
            ps.setString(2, stu.getCourse());
            ps.setInt(3, stu.getPerce());
            ps.setInt(4, roll);

            int res = ps.executeUpdate();

            if (res > 0) {
                System.out.println("Student Updated Successfully.");
            } else {
                System.out.println("Student Not Found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    // Delete
    public void deleteStu(int roll) {

        String sql = "DELETE FROM student WHERE roll=?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, roll);

            int res = ps.executeUpdate();

            if (res > 0) {
                System.out.println("Student Deleted Successfully.");
            } else {
                System.out.println("Student Not Found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Display All Students
    public void retrieve() {

        String sql = "SELECT * FROM student";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            System.out.println("----------------------------------------------");
            System.out.println("Roll\tName\tCourse\tPercentage");
            System.out.println("----------------------------------------------");

            while (rs.next()) {

                System.out.println(
                        rs.getInt("roll") + "\t" +
                                rs.getString("name") + "\t" +
                                rs.getString("course") + "\t" +
                                rs.getInt("perce")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Search by Roll Number
    public Student getStudent(int roll) {

        String sql = "SELECT * FROM student WHERE roll=?";

        Student st = null;

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, roll);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                st = new Student(
                        rs.getInt("roll"),
                        rs.getString("name"),
                        rs.getString("course"),
                        rs.getInt("perce")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return st;
    }
}

// Main Class
public class TestDB {

    public static void main(String[] args) {

        StudentDAO dao = new StudentDAO();

        Student s1 = new Student(1, "Sathish", "CSE", 95);
        Student s2 = new Student(2, "Kumar", "ECE", 90);

        // Insert
        dao.storeStu(s1);
        dao.storeStu(s2);

        // Display
        dao.retrieve();

        // Search
        Student s = dao.getStudent(1);

        if (s != null) {
            System.out.println("\nStudent Found");
            System.out.println("Roll      : " + s.getRoll());
            System.out.println("Name      : " + s.getName());
            System.out.println("Course    : " + s.getCourse());
            System.out.println("Percentage: " + s.getPerce());
        }

        // Update
        Student update = new Student(1, "Sathish Kumar", "AI & DS", 98);
        dao.updateStu(1, update);

        // Display Again
        dao.retrieve();

        // Delete
        dao.deleteStu(2);

        // Final Display
        dao.retrieve();
    }
}