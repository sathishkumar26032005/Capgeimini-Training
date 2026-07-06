import java.util.*;
interface max{
    int twolmax(int a,int b);
}
public class demo {
    public static void main(String[] args){
        /// 1
        max c1=(a,b) -> (a<b)?b:a;
        System.out.println(c1.twolmax(10,5));

        /// 2
        int n=2;
        System.out.println((n%2==0)?"true":"false");

        /// 3
        int sq=10;
        for(int i=1;i<sq;i++){
            if(i*i==sq){
                System.out.println("square number");
                break;
            }
            else{
                if(i*i>sq){
                    System.out.println("Not a square number");
                    break;
                }
            }
        }

        /// 4
        String s="Sathish";
        System.out.println(s.length());

        /// 5
        String up="sathish";
        String ans="";
        for(int i=0;i<up.length();i++){
            ans+=up.charAt(i)-32;
        }
        System.out.println(ans);
    }
}
