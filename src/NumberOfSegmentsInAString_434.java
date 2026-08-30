public class NumberOfSegmentsInAString_434 {
    public static int countSegments(String s) {
        if(s.length()==0){
            return 0;
        }
        int count=0;
        String str=s.trim();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' '){
                count++;
            }
        }
        if(count>0){
            return count+1;
        }else if(count==0 && str.length()!=0){
            return count+1;
        }
        else{
            return 0;
        }

    }
    public static void main(String[] args) {
        String s="Hello, my name is John";
        int res=countSegments(s);
        System.out.println(res);
    }
}
