//package Projects.StudentManagementSystem.main;
//
//
//import java.util.Scanner;
//
//import Projects.StudentManagementSystem.Model.Student;
//import Projects.StudentManagementSystem.Services.StudentSevice;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        StudentSevice service = new StudentSevice();
//
//        int choice;
//
//        do {
//
//            System.out.println("\n==================================");
//            System.out.println(" STUDENT MANAGEMENT SYSTEM ");
//            System.out.println("==================================");
//            System.out.println("1. Add Student");
//            System.out.println("2. View Students");
//            System.out.println("3. Search Student");
//            System.out.println("4. Update Student");
//            System.out.println("5. Delete Student");
//            System.out.println("6. Sort Students");
//            System.out.println("7. Exit");
//            System.out.print("Enter your choice: ");
//
//            choice = sc.nextInt();
//
//            switch (choice) {
//
//                case 1:
//
//                    System.out.print("Enter ID: ");
//                    int id = sc.nextInt();
//                    sc.nextLine();
//
//                    System.out.print("Enter Name: ");
//                    String name = sc.nextLine();
//
//                    System.out.print("Enter Age: ");
//                    int age = sc.nextInt();
//                    sc.nextLine();
//
//                    System.out.print("Enter Gender: ");
//                    String gender = sc.nextLine();
//
//                    System.out.print("Enter Email: ");
//                    String email = sc.nextLine();
//
//                    System.out.print("Enter Phone: ");
//                    String phone = sc.nextLine();
//                    sc.nextLine();
//
//                    System.out.print("Enter Course: ");
//                    String course = sc.nextLine();
//
//                    System.out.print("Enter Address: ");
//                    String address = sc.nextLine();
//
//                    System.out.print("Enter Percentage: ");
//                    int percentage = sc.nextInt();
//
//                    Student student = new Student(id, name, age, gender, email, phone, course, address, percentage);
//
//                    service.addStudent(student);
//
//                    break;
//
//                case 2:
//
//                    service.viewStudents();
//                    break;
//
//                case 3:
//
//                    System.out.print("Enter Student ID: ");
//                    id = sc.nextInt();
//
//                    Student s = service.searchStudent(id);
//
//                    if (s != null) {
//                        System.out.println(s);
//                    } else {
//                        System.out.println("Student Not Found.");
//                    }
//
//                    break;
//
//                case 4:
//
//                    System.out.print("Enter Student ID: ");
//                    id = sc.nextInt();
//                    sc.nextLine();
//
//                    System.out.print("Enter New Course: ");
//                    course = sc.nextLine();
//
//                    System.out.print("Enter New Percentage: ");
//                    percentage = sc.nextInt();
//
//                    service.updateStudent(id, course, percentage);
//
//                    break;
//
//                case 5:
//
//                    System.out.print("Enter Student ID: ");
//                    id = sc.nextInt();
//
//                    service.deleteStudent(id);
//
//                    break;
//
//                case 6:
//
//                    service.sortStudents();
//
//                    break;
//
//                case 7:
//
//                    System.out.println("Thank You!");
//
//                    break;
//
//                default:
//
//                    System.out.println("Invalid Choice.");
//
//            }
//
//        } while (choice != 7);
//
//        sc.close();
//    }
//
//}
