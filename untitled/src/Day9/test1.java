package Day9;
class cal<T extends Number>{
    T num;
    public cal(T num){
        this.num=num;
    }
    double squar(){
        return num.doubleValue()*num.doubleValue();
    }
}
public class test1 {
    public static void main(String[] args){
        cal<Integer> c1=new cal<>(4);
        System.out.println(c1.squar());
        //cal<String> st=new cal<String>("sat");


    }
}
