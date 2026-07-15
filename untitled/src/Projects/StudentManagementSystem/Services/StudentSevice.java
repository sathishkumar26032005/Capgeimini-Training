//package Projects.StudentManagementSystem.Services;
//
//import java.util.ArrayList;
//
//import Projects.StudentManagementSystem.Model.Student;
//import Projects.StudentManagementSystem.Util.util;
//
//
//public class StudentSevice {
//    private ArrayList<Student> students;
//
//    public StudentSevice() {
//
//        students = FileUtility.readObject();
//
//    }
//
//
//    public void addStudent(Student student) {
//
//        students.add(student);
//
//        FileUtility.writeObject(students);
//
//        System.out.println("Student Added Successfully.");
//
//    }
//    public void viewStudents() {
//
//        if(students.isEmpty()) {
//
//            System.out.println("No Students Found.");
//
//            return;
//
//        }
//
//        for(Student s : students) {
//
//            System.out.println(s);
//
//        }
//
//    }
//    public Student searchStudent(int id) {
//
//        for(Student s : students) {
//
//            if(s.getId()==id) {
//
//                return s;
//
//            }
//
//        }
//
//        return null;
//
//    }
//    public void deleteStudent(int id) {
//
//        Student student = searchStudent(id);
//
//        if(student!=null) {
//
//            students.remove(student);
//
//            FileUtility.writeObject(students);
//
//            System.out.println("Deleted Successfully.");
//
//        }
//
//        else {
//
//            System.out.println("Student Not Found.");
//
//        }
//
//    }
//    public void updateStudent(int id,String course,int percentage) {
//
//        Student student = searchStudent(id);
//
//        if(student!=null) {
//
//            student.setCourse(course);
//
//            student.setPercentage(percentage);
//
//            FileUtility.writeObject(students);
//
//            System.out.println("Updated Successfully.");
//
//        }
//
//        else {
//
//            System.out.println("Student Not Found.");
//
//        }
//
//    }
//    public void sortStudents() {
//
//        students.sort((s1,s2)->s1.getName().compareTo(s2.getName()));
//
//        viewStudents();
//
//    }
//    public  void saveStudents() {
//        FileUtility.writeObject(students);
//
//        System.out.println("Students saved successfully.");
//    }
//    public static void loadStudents() {
//        loadStudents();
//
//        System.out.println("Students loaded successfully.");
//
//
//
//    }
//}