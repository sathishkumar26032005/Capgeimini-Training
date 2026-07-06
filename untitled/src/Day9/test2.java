package Day9;
import java.util.*;
class Demo{
    public static void print(List<?> list){
        //this is will work with all data type
        //the syntax is public static void prit(List<? extends Number> list)
        for (Object obj:list){
            System.out.println(obj+" ");
        }
    }
}
public class test2 {
    public static void main(String[] args){

    }
}
