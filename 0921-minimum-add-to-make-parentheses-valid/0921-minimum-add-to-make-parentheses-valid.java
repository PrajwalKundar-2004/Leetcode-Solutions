class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack=new Stack<>();
        int i=0;
        while(i<s.length()){
            char c=s.charAt(i);
            if(c=='('){
                stack.push(c);
            }else if(c==')' && (stack.isEmpty() || stack.peek()==')' )){
                stack.push(c);
            }else if(c==')' && stack.peek()=='('){
                stack.pop();
            }
            i++;
        }
        if(stack.size()>0){
            return stack.size();
        }
        return 0;
    }
}