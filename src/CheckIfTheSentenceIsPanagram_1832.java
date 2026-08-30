public class CheckIfTheSentenceIsPanagram_1832 {

        public static boolean checkIfPangram(String sentence) {
            if(sentence.length()<26){
                return false;
            }
            int index;
            for(char c='a';c<='z';c++){
                index=sentence.indexOf(c);
                if(index==-1){
                    return false;
                }
            }
            return true;
        }

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean res=checkIfPangram(sentence);
        System.out.println(res);
    }
}
