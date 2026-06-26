import java.util.Arrays;

public class Unique {
    public static int singleNumber(int[] nums) {
        int result=0;
        for(int i=0;i<nums.length;i++){
            result=result^nums[i];
        }
    return result;
    }
    public static void main(String[] args){
        int[] nums={4,1,2,1,2};
        int res=singleNumber(nums);
        System.out.println(res);
    }
}
