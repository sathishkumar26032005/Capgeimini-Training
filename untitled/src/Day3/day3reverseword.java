public class day3reverseword {
    public static void main(String[] args){
        String s="dfghj sdfghj bnm, bnm nldfklf";
        String[] arr=s.split(" ");
        int i=0,j=arr.length-1;
        while(i<j){
            String tem=arr[i];
            arr[i]=arr[j];
            arr[j]=tem;
            i++;
            j--;
        }
        for(String an:arr){
            System.out.print(an+" ");
        }
    }
}
