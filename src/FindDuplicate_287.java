import java.util.Arrays;
import java.util.HashSet;

public class FindDuplicate_287 {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }

    static int findDuplicate(int[] nums) {
        int[] freq=new int[Arrays.stream(nums).max().getAsInt()+1];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>1){
                return i;
            }
        }
        return 0;
//        HashSet<Integer> set=new HashSet<>();
//        for(int num:nums){
//            if(set.contains(num)){
//                return num;
//            }else {
//                set.add(num);
//            }
//        }
//        return 0;
    }
}
