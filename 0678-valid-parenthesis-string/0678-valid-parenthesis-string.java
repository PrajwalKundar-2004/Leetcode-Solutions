class Solution {
    public boolean checkValidString(String s) {
        // char arr[]=s.toCharArray();
        // Stack<Character> stack=new Stack<>();
        // int count=0;
        // int right=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]=='('){
        //         stack.push(arr[i]);
        //     } else if(arr[i]==')' && stack.size()>0 && stack.peek()=='('){
        //         stack.pop();
        //     }else if(arr[i]==')' && stack.size()>=0){
        //         right++;
        //     }
        //     else{
        //         count++;
        //     }
        // }
        // if(stack.size()==0 && right==count){
        //     return true;
        // }
        // else if(stack.size()==count && right==0){
        //     return true;
        // }else if(stack.size()==0 && count>0 && right<=count){
        //     return true;
        // }
        // else{
        //     return false;
        // }
        int minOpen = 0;
        int maxOpen = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {
                minOpen++;
                maxOpen++;
            } 
            else if (c == ')') {
                minOpen--;
                maxOpen--;
            } 
            else { // '*'
                minOpen--;
                maxOpen++;
            }

            // Too many closing brackets
            if (maxOpen < 0) {
                return false;
            }

            // We cannot have negative minimum
            minOpen = Math.max(minOpen, 0);
        }

        return minOpen == 0;
    }
}