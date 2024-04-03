public class Permentation {
    public static void main(String[] args) {
        String s="ABC";
        String temp="";
        permu(s,temp);
    }

    private static void permu(String s, String temp) {
        if(s.length()==0){
            System.out.println(temp+"");
        }else{
            for(int i=0;i<s.length();i++){
                char f=s.charAt(i);
                String rem=s.substring(0,i)+s.substring(i+1);
                permu(rem,temp+f);
            }
        }

    }
}
