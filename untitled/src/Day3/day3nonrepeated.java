public class day3nonrepeated {
    public static void main(String []args){
        String s="saiasa";

        for(int i=0;i<s.length();i++){
            boolean f=true;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    f=false;
                    break;
                }
            }
            if(f){
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}
