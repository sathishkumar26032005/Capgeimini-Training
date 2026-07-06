package Day10;

import java.util.function.Function;

public class functiontest {
    public static void main(String[] args) {
        Function<Integer,Integer> f1=(a)->a*a;
        System.out.println(f1.apply(10));

    }
}
