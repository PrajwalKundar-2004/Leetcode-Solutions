public class ValidParenthesis_125 {
    public static boolean isPalindrome(String message){
        message=message.trim();
        message=message.toLowerCase();
        int low=0;
        int high=message.length()-1;
        while(low<high){
            char cl=message.charAt(low);
            char ch=message.charAt(high);
            if(!((cl>='a' && cl<='z') ||( cl>='0' && cl<='9'))){
                low++;
            }else if(!((ch>='a' && ch<='z') ||( ch>='0' && ch<='9'))){
                high--;
            }else{
                if(cl!=ch){
                    return false;
                }
                low++;
                high--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s= "A man, a plan, a canal: Panama";
        boolean res=isPalindrome(s);
        System.out.println(res);
    }
}
