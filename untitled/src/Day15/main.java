package Day15;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Iterator;
class Staff {
    int id;
    String name;
    String dept;
    int salary;
    Staff(int id,String name,String dept,double salary){
        this.dept=dept;
        this.id=id;
        this.name=name;
        this.salary=(int) salary;
    }
    public String toString(){
        return id+" "+name+" "+dept+" "+salary+".00";
    }
}
public class Main{
    public static void main(String[] args) {
        PriorityQueue<Staff> pq=new PriorityQueue<>((a,b)->a.salary- b.salary);
        pq.add(new Staff(1,"sathih","cse",2000.0));
        pq.add(new Staff(2,"logesh","cse",3000.0));
        pq.add(new Staff(3,"naveen","cse",2178.0));
        pq.add(new Staff(4,"siva","IT",1754.0));
        pq.add(new Staff(5,"praveen","AIDS",1200.0));
        System.out.println("Iterator Function");
        Iterator<Staff> it=pq.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("Poll() function");
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }

    }
}
