public class SmallLettergreaterThanTarget_744 {
    static char nextGreatestLetter(char[] letters, char target) {
        int low=0;
        int high=letters.length-1;
        int mid;
        while(low<=high){
            mid=low+((high-low)/2);
            if(letters[mid]>target){
                high=mid-1;
            }else if(letters[mid]<=target){
                low=mid+1;
            }
        }
        if(high>=0 && low<=letters.length-1) {
            if (letters[low] > target) {
                return letters[low];
            }
            else if (letters[high] < target) {
                return letters[0];
            }
        }
        return letters[0];
    }

    public static void main(String[] args) {
        char letter[]={'c','f','j'};
        char target='c';
        char res=nextGreatestLetter(letter,target);
        System.out.println(res);
    }
}
