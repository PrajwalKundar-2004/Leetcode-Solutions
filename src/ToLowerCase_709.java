public class ToLowerCase_709 {
    public static String toLowerCase(String s) {
        String str="";
         for(int i=0;i<s.length();i++){
             char c=s.charAt(i);
               if(c>='A' && c<='Z'){
                 str+=(char)(c+32);
               }else{
                 str+=c;
               }
         }
        return str;
    }
    public static void main(String[] args) {
        String str="Hello[]Uj";
        String str2=toLowerCase(str);
        System.out.println(str2);

    }
}
