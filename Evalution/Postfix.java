import java.util.Stack;

public class Postfix {
    public static void main(String[] args) {
        String s="545*+5/";
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            //System.out.println("1");
            if(Character.isDigit(s.charAt(i))){
                st.push(s.charAt(i)-48);
            }while(st.isEmpty()){
                    int ans1 = st.pop();
                    int ans2 = st.pop();
                    int sum =cal(ans1,ans2,s.charAt(i));
                    System.out.println(sum);
                    st.push(sum);
            }
        }
        System.out.println("Answer : "+st.pop());
    }

    private static int cal(int ans1, int ans2, char c) {
        int sum=0;
        switch (c){
            case '+':
                sum=ans1+ans2;
                break;
            case '-':
                sum=ans1-ans2;
                break;
            case '*':
                sum=ans1*ans2;
                break;
            case '/':
                sum=ans1/ans2;
                break;
            default:
                sum=-1;
        }
        return sum;
    }
}
