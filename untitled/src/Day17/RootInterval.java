package Day17;
import java.util.*;

public class RootInterval {
    public static void main(String[] args) {
        int[][] arr={{0,30},{5,10},{15,20}};
        Arrays.sort(arr, (a,b)->a[0] - b[0]);
        int c=1;
        for(int i=1;i<arr.length;i++){
            int s=arr[i][0];
            int e=arr[i-1][1
                    ];
            if(e<=s){
                c++;
            }
        }
        System.out.println(c);
    }
}
