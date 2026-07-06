package Day10;

import java.util.function.Predicate;
//predicate is return boolean ;
//predicate means to pass only one value

public class predicate {
    public static void main(String[] args) {
        Predicate<Integer> p1=(x)->x%2==0;
        System.out.println(p1.test(22));//true
        Predicate<String> p2=(x)->x.isEmpty();
        System.out.println(p2.test(""));//true
        System.out.println(p2.test("java"));//false
        Predicate<Integer> p3=n->n<100;
        Predicate<Integer> p4=n->n>10;
        Predicate<Integer> p5=p3.and(p4);
        System.out.println(p5.test(100));
    }
}
