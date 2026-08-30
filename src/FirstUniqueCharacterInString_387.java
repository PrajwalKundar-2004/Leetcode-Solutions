public class FirstUniqueCharacterInString_387 {
        public static int firstUniqChar(String s) {
//            StringBuilder sb=new StringBuilder(s);
//            boolean unique;
//            char c;
//            for(int i=0;i<sb.length();i++){
//                c=s.charAt(i);
//                if(c!='0'){
//                    unique=true;
//                    for(int j=i+1;j<sb.length();j++){
//                        if(c==sb.charAt(j)){
//                            unique=false;
//                            sb.setCharAt(j,'0');
//                        }
//                    }
//                    if(unique) return i;
//                }
//            }
//            return -1;
//            better approach
            int[] freq = new int[26];

            for(int i = 0; i < s.length(); i++){
                int c = s.charAt(i) - 'a';
                freq[c]++;
            }

            for(int i = 0; i < s.length(); i++){
                int c = s.charAt(i) - 'a';

                if(freq[c] == 1){
                    return i;
                }
            }

            return -1;

        }

    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(firstUniqChar(s));
    }

}
