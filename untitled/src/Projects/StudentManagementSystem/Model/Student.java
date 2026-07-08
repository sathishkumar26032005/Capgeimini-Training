package Projects.StudentManagementSystem.Model;
//
//package Projects.StudentManagementSystem.Model;

public class Student {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String phone;
    private String email;
    private String course;
    private String address;
    private double percentage;

    // Constructor
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Full Constructor
    public Student(int id, String name, int age, String gender,
                   String phone, String email, String course,
                   String address, double percentage) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.course = course;
        this.address = address;
        this.percentage = percentage;
    }
    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }

    public String getAddress() {
        return address;
    }

    public double getPercentage() {
        return percentage;
    }

    // Setters
    public void setAge(int age) {
        this.age = age;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", course='" + course + '\'' +
                ", address='" + address + '\'' +
                ", percentage=" + percentage +
                '}';
    }
}
