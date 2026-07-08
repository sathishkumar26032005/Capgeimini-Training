//package Projects.StudentManagementSystem.Services;
//
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//import Projects.StudentManagementSystem.Model.Student;
//
//public class StudentSevice{
//
//    private List<Student> st = new ArrayList<>();
//
//    private static final String FILE_PATH = "students.txt";
//
//    public void addStudent(Student data) {
//
//        st.add(data);
//
//        try (BufferedWriter bw =
//                     new BufferedWriter(new FileWriter(FILE_PATH, true))) {
//
//            bw.write(data.getId() + "," +
//                    data.getName() + "," +
//                    data.getCourse() + "," +
//                    data.getEmail() + "," +
//                    data.getAddress() + "," +
//                    data.getAge() + "," +
//                    data.getGender() + "," +
//                    data.getPercentage());
//
//            bw.newLine();
//
//            System.out.println("Student Added Successfully.");
//
//        } catch (IOException e) {
//            System.out.println("Error while adding student.");
//            e.printStackTrace();
//        }
//    }
//
//    public void update(int id,) {
//
//    }
//
//    public void delete() {
//    }
//
//    public void viewProfile() {
//    }
//
//    public void searchStudent() {
//    }
//}