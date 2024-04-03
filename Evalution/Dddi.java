import java.util.Arrays;
import java.util.Stack;

public class Dddi {
    public static void main(String[] args) {
        String s="IIDDIDID";
        Stack<Integer> st=new Stack<>();
        int index=0;
        int nums[]=new int[s.length()+1];
        for(int i=0;i<=s.length();i++){
            st.push(i+1);
            if(i==s.length() || s.charAt(i)=='I'){
                while(!st.isEmpty()){
                    nums[index++]=st.pop();
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
