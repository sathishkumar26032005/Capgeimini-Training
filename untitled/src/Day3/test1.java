// abstract
abstract class  tax{
    abstract void cal(double salary);
}
class salary extends tax{
    @Override
    void cal(double salary){
        System.out.println(0.18*salary);
    }
}
class business extends tax{
    @Override
    void cal(double salary){
        System.out.println(salary*0.01);
    }
}
public class test1 {
    public static void main(String[] args){
        tax c1=new salary();
        c1.cal(100);
        tax c2=new business();
        c2.cal(1000);
    }
}
