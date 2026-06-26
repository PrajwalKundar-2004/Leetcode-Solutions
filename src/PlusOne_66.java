import java.util.Arrays;

public class PlusOne_66 {
    static int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--) {

            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newArray = new int[digits.length + 1];
        newArray[0] = 1;

        return newArray;
    }
    public static void main(String[] args) {
        int[] arr={9};
        int[] res=plusOne(arr);
        System.out.println(Arrays.toString(res));
    }
}
