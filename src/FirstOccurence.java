public class FirstOccurence {
    public static int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length()){
            return -1;
        }
        int length;
        for(int i=0;i<=(haystack.length()-needle.length());i++){
            length=0;
            for(int j=0;j<needle.length();j++){
                if(needle.charAt(j)==haystack.charAt(i+j)){
                    length++;
                }
                else{
                    break;
                }
            }
            if(length==needle.length()){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        String haystack = "saidbutsad";
        String needle = "sad";
        int res=strStr(haystack,needle);
        System.out.println(res);
    }
}
