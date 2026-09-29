class Solution {
    public int scoreOfParentheses(String s) {
        // Stack<Integer> stack=new Stack<>();
        // stack.push(0);
        // int score;
        // for(int i=0;i<s.length();i++){
        //     char c=s.charAt(i);
        //     if(c=='('){
        //         stack.push(0);
        //     }else{
        //         int val=stack.pop();
        //         score=Math.max(2*val,1);
        //         stack.push(score+stack.pop());
        //     }
        // }
        // return stack.pop();

        // better approach
        int count=0;
        int score=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
            }else{
                count--;
                if(s.charAt(i-1)=='('){
                    score+=1<<count;
                }
            }
        }
        return score;
    }
}