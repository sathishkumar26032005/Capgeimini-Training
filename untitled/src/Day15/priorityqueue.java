package Day15;
import java.util.*;
public class priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        pq.add(10);
        pq.add(40);
        pq.add(50);
        pq.add(70);
        pq.add(80);
        pq.add(100);
        System.out.println(pq);
        System.out.println("Poll()");
        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }

    }
}
