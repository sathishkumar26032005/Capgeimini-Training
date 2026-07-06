public class day3removedup {
    public static void main(String[] args){
        String s="sssfdhkjl";
        boolean[] arr=new boolean[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=true;
        }
        for(int i=0;i<s.length();i++){
            if(arr[i]==true) {
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        arr[j] = false;
                    }
                }
            }
        }
        String ans="";
        for(int i=0;i<s.length();i++){
            if(arr[i]==true){
                ans+=s.charAt(i);
            }
        }
        System.out.println(ans);

    }
}
