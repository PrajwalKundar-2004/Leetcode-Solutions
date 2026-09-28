class Solution { 
    public boolean backspaceCompare(String s, String t) { 
        Stack<Character> stack1 = new Stack<>(); 
        Stack<Character> stack2 = new Stack<>();  
        int i = 0; 
        char c;  
        while(i < s.length()){ 
            c = s.charAt(i);    
            if(c == '#'){ 
                if(!stack1.isEmpty()){
                    stack1.pop(); 
                }
            }else{ 
                stack1.push(c); 
            } 
            i++; 
        }    
        i = 0; 
        while(i < t.length()){ 
            c = t.charAt(i);     
            if(c == '#'){ 
                if(!stack2.isEmpty()){
                    stack2.pop(); 
                }
            }else{ 
                stack2.push(c); 
            } 
            i++; 
        } 
        while(!stack1.isEmpty() && !stack2.isEmpty()){ 
            if(stack1.pop() != stack2.pop()){ 
                return false; 
            } 
        } 
        return stack1.isEmpty() && stack2.isEmpty();
    } 
}