//import java.util.ArrayList;
//import java.util.List;
//
//class details {
//    private int id;
//    private String name;
//    private int mark;
//    private String dept;
//
//    public details(int id, String name, int mark,String dept) {
//        this.id = id;
//        this.name = name;
//        this.mark = mark;
//        this.dept=dept;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getMark() {
//        return mark;
//    }
//    public String getdept(){
//        return dept;
//    }
//}
//
//public class student{
//    public static void Main(String[] args){
//        List<details> li = new ArrayList<>();
//
//        li.add(new details(1, "sathish", 350,"cse"));
//        li.add(new details(2, "logesh", 310,"IT"));
//        li.add(new details(3, "kalai", 400,"cse"));
//        li.add(new details(4, "navin", 420,"IT"));
//        li.add(new details(5, "gokul", 450,"EEE"));
//        li.add(new details(6, "ravi", 499,"EEE"));
//        li.add(new details(7, "Arun", 300,"cse"));
//        li.add(new details(8, "Deepa", 300,"IT"));
//        li.add(new details(9, "Muthu",300,"cse"));
//        li.add(new details(10, "Mani", 300,"IT"));
//        li.add(new details(11, "Malar", 300,"EEE"));
//        li.add(new details(12, "Nizam", 400,"EEE"));
//
//        li.sort((o1, o2) -> {
//            if (o1.getMark() != o2.getMark()) {
//                return o2.getMark() - o1.getMark();
//            }
//            if (!o1.getName().equals(o2.getName())) {
//                return o1.getName().compareTo(o2.getName());
//            }
//            return o1.getId() - o2.getId();
//        });
//    }
//}
