package Day10;

import java.util.function.BiPredicate;

//predicate is return boolean ;
//Bipredicate means to pass multiple value
public class Bipredicate {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> b1=(a,b)->a<b;
        System.out.println(b1.test(1,2));


    }
}
