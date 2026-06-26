import java.util.Arrays;
import java.util.Stack;

public class ValidParenthesis_20 {
    static boolean isValid(String s) {
        int count=0;
        if(s.length()%2!=0){
            return false;
        }
        char[] arr=s.toCharArray();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<arr.length;i++){
           if(stack.isEmpty()){
              if(arr[i]==']' || arr[i]=='}' || arr[i]==')'){
                  return false;
              }
           }
            if(arr[i]=='(' || arr[i]=='[' || arr[i]=='{'){
                stack.push(arr[i]);
            } else if (arr[i]==')' && stack.peek()=='(') {
               stack.pop();
               count++;
            } else if (arr[i]==']' && stack.peek()=='[') {
                stack.pop();
                count++;
            } else if (arr[i]=='}' && stack.peek()=='{') {
                stack.pop();
                count++;
            }else{
                return false;
            }
        }
        if(count==s.length()/2){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str=new String("(([]){})");
        boolean res=isValid(str);
        System.out.println(res);
    }
}
