package Day15;

public class Student {
    int id;
    String name;
    int mark;
    Student(int id,String name,int mark){
        this.mark=mark;
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return id+" "+name+" "+mark;
    }
}
