package Day2;
import java.util.*;
public class equal {
    public static void String(String[] args){
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
            sum+=arr[i];
        }
        int l=0;
        int r=sum;
        for(int i=0;i<n;i++){
            if(r-arr[i]==l){
                System.out.print(arr[i]+" ");
                break;
            }
            l+=arr[i];
            r-=arr[i];
        }
    }
}
