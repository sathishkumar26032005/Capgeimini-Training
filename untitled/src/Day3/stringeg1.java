public class stringeg1 {
    public static  void main(String[] args){
        String s=" sathish";
        String s1="Sathish";
        String b="";
        System.out.println(s.charAt(1));
        System.out.println(s.indexOf('s'));
        System.out.println(s.lastIndexOf('s'));
        System.out.println(s.toUpperCase()+" "+s.toLowerCase());
        System.out.println(s.trim());
        System.out.println(s.replace('h','H'));
        System.out.println(s.substring(2,5));
        System.out.println(s.isBlank());
        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s1));
        System.out.println(s.compareTo(s1));




    }
}
