// interface types
interface calculatro{
    int cal(int a,int b);
}
class abc implements  calculatro{
    public  int cal(int a,int b){
        return a+b;
    }
}
public class test {
    public static void main(String[] args){
        // type 1 normal
        calculatro c1=new abc();
        System.out.println(c1.cal(10,20));

        // tyoe 2  anonymous

        calculatro c2=new calculatro() {
            @Override
            public int cal(int a, int b) {
                return b-a;
            }
        };
        System.out.println(c2.cal(10,20));

        //type 3 lambda function

        calculatro c3=(a,b) -> a*b;
        System.out.print(c3.cal(10,20));

    }
}
