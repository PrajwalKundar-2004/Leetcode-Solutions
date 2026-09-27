class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> outer=new Stack<>();
        StringBuilder rev=new StringBuilder();
        int len=s.length();
        int i=0;
        char x;
        while(i<len){
            char c=s.charAt(i);
            if(c==')'){
                while((x=outer.pop())!='('){
                   rev.append(x);
                }
                for(int j=0;j<rev.length();j++){
                    outer.push(rev.charAt(j));
                }
                rev.setLength(0);
            }else{
                outer.push(c);
            }
            i++;
        }
        StringBuilder sb=new StringBuilder();
        while(!outer.isEmpty()){
            sb.append(outer.pop());
        }
    return sb.reverse().toString();   
    }
}