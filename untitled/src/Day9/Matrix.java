package Day9;
import java.util.*;
public class Matrix {
    public static void transport(int[][] arr){
        int[][] tra=new int[arr.length][arr.length];
        for(int i=0;i< arr.length;i++){
            for (int j=0;j< arr[i].length;j++){
                tra[i][j]=arr[j][i];
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void display(int[][] arr){
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr.length;j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void columsum(int[][] arr){
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for (int j=0;j< arr.length;j++){
                sum+=arr[i][j];
            }
            System.out.println("Colum "+ i+": "+sum);
        }
    }
    public static void sprial(int[][] arr){
        int l=0,r= arr.length-1, t=0,b= arr.length-1;
        while (t<=b && l<=r){
            for(int i=l;i<=r;i++){
                System.out.print(arr[t][i]+" ");
            }
            t++;
            for (int i=t;i<=b;i++){
                System.out.print(arr[i][r]+" ");
            }
            r--;
            if(l<r){
                for (int i=r;i>=l;i--){
                    System.out.print(arr[b][i]+" ");
                }
                b--;
            }
            if(t<b){
                for (int i=t;i>=b;i--){
                    System.out.print(arr[i][l]+" ");
                }
                l++;
            }
        }
    }

    public static void  diamond(int[][] arr){
        int j=arr.length/2;
        int i=0;
        while (j>=0){
            System.out.print(arr[i][j]);
            j--;
            i++;
        }
        j++;
        i--;
        while (j<arr.length/2){
            j++;
            i++;
            System.out.print(arr[i][j]);
        }

        while (j< arr.length-1){
            i--;
            j++;
            System.out.print(arr[i][j]);
        }
        while (i!=1){
            j--;
            i--;
            System.out.print(arr[i][j]);
        }
    }
    public static void SumOfUpperandLowerTriangle(int[][] arr){
        int i=0;
        int j= arr.length/2;
        int c=0;
        int uppsum=0;
        while(c<=(arr.length/2)){
            uppsum+=arr[i][j];
            for(int s=1;s<=c;s++){
                uppsum+=arr[i][j+s];
                uppsum+=arr[i][j-s];
            }
            c++;
            i++;
        }
        System.out.println(uppsum);
        int lowsum=0;
        i= arr.length-1;
        j= arr.length/2;
        c=0;
        while(c<=(arr.length/2)){
            lowsum+=arr[i][j];
            for(int s=1;s<=c;s++){
                lowsum+=arr[i][j+s];
                lowsum+=arr[i][j-s];
            }
            c++;
            i--;
        }
        System.out.println(lowsum);

    }
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        int r=ob.nextInt();
        int[][] arr=new int[r][r];
        for (int i=0;i<r;i++){
            for (int j=0;j<r;j++){
                arr[i][j]=ob.nextInt();
            }
        }
        //display(arr);
        //transport(arr);
        //columsum(arr);
        //sprial(arr);
        //diamond(arr);
        SumOfUpperandLowerTriangle(arr);
    }
}
