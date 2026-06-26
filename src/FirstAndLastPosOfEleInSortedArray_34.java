import java.util.Arrays;

public class FirstAndLastPosOfEleInSortedArray_34 {
    static int[] searchRange(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int mid;
        while(low<=high) {
            mid=low+((high-low)/2);
            if(nums[mid]<target){
                low=mid+1;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                int first=mid,second=mid;
                int i=1;
                while(mid-i>=0 && nums[mid-i]==target){
                    first=mid-i;
                    i++;
                }
                int j=1;
                while(mid+j<nums.length && nums[mid+j]==target){
                    second=mid+j;
                    j++;
                }
                return new int[]{first,second};
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target=8;
        int[] res=searchRange(nums,target);
        System.out.println(Arrays.toString(res));
    }
}
