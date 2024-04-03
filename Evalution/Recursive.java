public class Recursive {
    public static void main(String[] args) {
        String s="ABC";
        String empty="";
        permut(s,empty);
    }

    private static void permut(String s, String empty) {
        if(s.length()==0){
            System.out.println(empty+"");
        }
        char c=s.charAt(0);
        String rem=s.substring(1);
        permut(empty + c, rem);
    }

}
