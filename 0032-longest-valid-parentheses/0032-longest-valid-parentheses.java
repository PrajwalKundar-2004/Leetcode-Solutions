class Solution {
    public int longestValidParentheses(String s) {
       int max=0;
       int left=0,right=0;
       for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                left++;
            }else{
                right++;
            }
            if(left==right){
                max=Math.max(max,(left+right));
            }
            if(right>left){
                left=0;
                right=0;
            }
       }
       left=0;
       right=0;
       for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if(c==')'){
                right++;
            }else{
                left++;
            }
            if(left==right){
                max=Math.max(max,(left+right));
            }
            if(left>right){
                left=0;
                right=0;
            }
       }
       return max;
    }
}