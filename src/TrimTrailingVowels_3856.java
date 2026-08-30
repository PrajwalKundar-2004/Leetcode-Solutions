public class TrimTrailingVowels_3856 {
    public static  String trimTrailingVowels(String s) {
        int last=s.length()-1;
        int count=0;
        char c;
        for(int i=last;i>=0;i--){
            c=s.charAt(i);
            if(!(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')){
                break;
            }else{
                count++;
            }
        }
        int end=(last-count)+1;
        s=s.substring(0,end);
        return s;
    }
    public static void main(String[] args) {
        String str="fraeiou";
        str=trimTrailingVowels(str);
        System.out.println(str);

    }
}
