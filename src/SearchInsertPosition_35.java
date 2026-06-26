public class SearchInsertPosition_35 {

    static int searchInsert(int[] nums, int target) {
        if(target<nums[0]){
            return 0;
        }
        int low=0;
        int high=nums.length-1;
        int mid;
        while(low<=high){
            mid=low+((high-low)/2);
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                low=mid+1;
            }else if(nums[mid]>target){
              if(nums[mid-1]<target){
                  return mid;
              }else{
                  high=mid-1;
              }
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int target=1;
        int res=(searchInsert(nums,target));
        System.out.println(res);
    }
}
