public class ReverseWordsInString_151 {
        public static String reverseWords(String s) {
            // String words="";
            // s=s.trim();
            // char c;
            // int count=0,i;
            // for(i=0;i<s.length();i++){
            //     c=s.charAt(i);
            //     if(c!=' '){
            //         count++;
            //     }else{
            //         if(count>0){
            //             words=' '+(s.substring(i-count,i))+words;
            //             count=0;
            //         }
            //     }
            // }
            // words=(s.substring(i-count,i))+words;
            // return words;
//            better approach
            StringBuilder words=new StringBuilder();
            s=s.trim();
            char c;
            int count=0,i;
            for(i=s.length()-1;i>=0;i--){
                c=s.charAt(i);
                if(c!=' '){
                    count++;
                }else{
                    if(count>0){
                        words.append((s.substring(i+1,i+count+1))+" ");
                        count=0;
                    }
                }
            }
            if(count>0) {
                words.append(s.substring(0,count));
            }
            String ans=words.toString();
            return ans;
        }

    public static void main(String[] args) {
        String ans=reverseWords("the sky is blue");
        System.out.println(ans);
    }
}
