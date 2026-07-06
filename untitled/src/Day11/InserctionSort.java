package Day11;

public class InserctionSort {
    public static void insectionsort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }

    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        insectionsort(arr);
        for (int i:arr){
            System.out.println(i+" ");
        }


    }
}
