//import java.util.*;
//
//class Data {
//    private int id;
//    private String name;
//    private int mark;
//
//    public Data(int id, String name, int mark) {
//        this.id = id;
//        this.name = name;
//        this.mark = mark;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//      return name;
//    }
//
//    public int getMark() {
//        return mark;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        List<Data> li = new ArrayList<>();
//
//        li.add(new Data(7, "sathish", 300));
//        li.add(new Data(2, "logesh", 300));
//        li.add(new Data(3, "kalai", 300));
//        li.add(new Data(0, "navin", 300));
//        li.add(new Data(8, "kalai", 300));
//        li.add(new Data(9, "ravi", 400));
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
//
//        for (Data s : li) {
//            System.out.println(s.getId() + "\t" + s.getName() + "\t\t" + s.getMark());
//        }
//    }
//}
import java.util.ArrayList;
import java.util.List;
import java.util.*;

class details {
    private int id;
    private String name;
    private int mark;
    private String dept;

    public details(int id, String name, int mark,String dept) {
        this.id = id;
        this.name = name;
        this.mark = mark;
        this.dept=dept;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }
    public String getdept(){
        return dept;
    }
}

public class Main{
    public static void main(String[] args){
        List<details> li = new ArrayList<>();

        li.add(new details(1, "sathish", 350,"cse"));
        li.add(new details(2, "logesh", 310,"IT"));
        li.add(new details(3, "kalai", 400,"cse"));
        li.add(new details(4, "navin", 420,"IT"));
        li.add(new details(5, "gokul", 450,"EEE"));
        li.add(new details(6, "ravi", 499,"EEE"));
        li.add(new details(7, "Arun", 300,"cse"));
        li.add(new details(8, "Deepa", 300,"IT"));
        li.add(new details(9, "Muthu",300,"cse"));
        li.add(new details(10, "Mani", 300,"IT"));
        li.add(new details(11, "Malar", 300,"EEE"));
        li.add(new details(12, "Nizam", 400,"EEE"));

//        li.sort((o1, o2) -> {
//            if (o1.getMark() != o2.getMark()) {
//                return o2.getMark() - o1.getMark();
//            }
//            if (!o1.getName().equals(o2.getName())) {
//                return o1.getName().compareTo(o2.getName());
//            }
//            return o1.getId() - o2.getId();
//        });
//        System.out.println("More then 80 percentage");
//        for(details s:li){
//            if(s.getMark()>400){
//                System.out.println(s.getId()+" "+s.getName());
//            }
//        }
        HashMap<String,List<details>> map=new HashMap<>();
        for(details d:li){
            if(map.containsKey(d.getdept())){
                map.get(d.getdept()).add(d);
            }
            else{
                List<details> ab=new ArrayList<>();
                ab.add(d);
                map.put(d.getdept(),ab);
            }
        }
        for(String s:map.keySet()){
            List<details> de=map.get(s);
            int max=de.get(0).getMark();
            for(details d:de){
                if(max<d.getMark()){
                    max= d.getMark();
                }
            }
            System.out.println("Departement "+s);
            for(details stu: de){
                System.out.println("Name "+stu.getName()+" Mark "+stu.getMark());
            }
        }


    }
}
