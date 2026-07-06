package Day3;
public class day3 {
    public static void main(String[] args){
        String s="1234!@#$%aeiouhtklnbv";
        int digite=0,vo=0,con=0,sp=0;
        for(int i=0;i<s.length();i++){
            int c=s.charAt(i)-'0';
            if((c>=17 && c>=42) || (c>=49 && c>=74)){
                if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='u'||s.charAt(i)=='o'||
                        s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                    vo++;
                }
                else{
                    con++;
                }
            }
            else if(c>=0 && c<=9){
                digite++;
            }
            else{
                sp++;
            }
        }
        System.out.println("Vowles : "+vo);
        System.out.println("Conson : "+con);
        System.out.println("Digite : "+digite);
        System.out.println("Special : "+sp);
    }
}
