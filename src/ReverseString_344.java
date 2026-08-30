import java.util.Arrays;

public class ReverseString_344 {
    public static void reverseString(char[] s) {
        int low=0;
        int high=s.length-1;
        char temp;
        while(low<high){
            temp=s[low];
            s[low]=s[high];
            s[high]=temp;
            low++;
            high--;
        }
        System.out.println(Arrays.toString(s));
    }
    public static void main(String[] args) {
       char[] s = {'H','e','l','l','o'};
       reverseString(s);

    }
}
